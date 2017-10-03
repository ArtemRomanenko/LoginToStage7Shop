package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjects {

    WebDriver driver;

    public PageObjects(WebDriver driver) {
        this.driver = driver;
    }

    public void loginButton(){
        driver.get("http://stage7shop.com.ua/");
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/a[1]/span")).click();
    }

    public void continueButton(){
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/a")).click();
    }

    public void firstName(){
        driver.findElement(By.name("firstname")).sendKeys("Test");
    }

    public void secondName(){
        driver.findElement(By.name("lastname")).sendKeys("Test");
    }

    public void email(){
        driver.findElement(By.name("email")).sendKeys("test@test.com");
    }

    public void telephone(){
        driver.findElement(By.name("telephone")).sendKeys("123456789");
    }

    public void password (){
        driver.findElement(By.name("password")).sendKeys("test12345");
    }

    public void confirmPassword(){
        driver.findElement(By.name("confirm")).sendKeys("test12345");
    }

    public void newsletterConfirm(){
        driver.findElement(By.name("newsletter")).click();
    }

    public void agreementCheckbox(){
        driver.findElement(By.name("agree")).click();
    }

    public void agreementCheck(){
        if(driver.findElement(By.name("agree")).isSelected()){
            driver.findElement(By.xpath("//*[@id=\"content\"]/div/form/div/div/input[2]")).click();
        }
        else{
            System.out.println("Checkbox is not selected");
        }
    }

    public void accountCreated(){
        String newAcc = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/h1")).getText();
        if (newAcc.contentEquals("Ваша учётная запись создана!")){
            System.out.println("Test Passed");
        }
        else{
            System.out.println("test failed");
        }

    }






}
