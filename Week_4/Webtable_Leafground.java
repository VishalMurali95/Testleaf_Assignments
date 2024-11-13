package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Leafground {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//locating the table
		WebElement webTable = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody"));
		
		//finding the row count
		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
		System.out.println("Size of row is: "+rows.size());
		System.out.println("***************************************");
		
		//finding the column count
		//div[@class='ui-datatable-scrollable-header-box']/table//th >> since it's coming under grandchild category we can use // to directly locate the <th> tag
		List<WebElement> columns = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-header-box']/table/thead/tr/th"));
		System.out.println("Size of column is:"+columns.size());
		System.out.println("***************************************");

		
		//extract particular value from the table - row[2], column[3]
		WebElement particularValue = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table//tr[2]/td[3]"));
		System.out.println("Text of row[2], column[3] is :"+particularValue.getText());
		System.out.println("***************************************");

		
		//extract all values in a row
		List<WebElement> rowvalues = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']//tr[3]/td"));
		
		List<String> rowvalue_list = new ArrayList<String>();
		
		for (WebElement rowvalue_ext : rowvalues) {
			rowvalue_list.add(rowvalue_ext.getText());
		}
		System.out.println("Row 3 values are :"+rowvalue_list);
		System.out.println("***************************************");
		
		//extract all the values of a particular column
		
		List<WebElement> partcol = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']//tr/td[3]"));
		
		List<String> col_list = new ArrayList<String>();
		
		for (WebElement partcol_ext : partcol) {
			col_list.add(partcol_ext.getText());
			
		}
		System.out.println("Column 3 values are :"+col_list);
		System.out.println("***************************************");
		
		//extract all the datas from the table
		List<WebElement> allData = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']//tr/td"));
		
		List<String> alldata_list = new ArrayList<String>();
		
		for (WebElement allData_ext : allData) {
			alldata_list.add(allData_ext.getText());
			
		}
		System.out.println("Table values are :"+alldata_list);
		System.out.println("***************************************");
		
		//for dynamic changing tables
		
		List<String> dyna_row_list = new ArrayList<String>();
		List<String> dyna_column_list = new ArrayList<String>();
		
		for (int i = 1; i < rows.size(); i++) {
			//here we don't use find Elements >> only use Element since we are using index
			// make sure the index value set to 1, because 0 index is the header
			WebElement dynamic_row = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']//tr["+i+"]/td"));
			//dyna_row_list.add(dynamic_row.getText());
			for (int j = 1; j < columns.size(); j++) {
				WebElement dynamic_col = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']//tr/td["+j+"]"));
				dyna_column_list.add(dynamic_col.getText());
			}
			
		}
		
		System.out.println("Dynamic row values: "+dyna_row_list);
		System.out.println("Dynamic column values: "+dyna_column_list);


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
