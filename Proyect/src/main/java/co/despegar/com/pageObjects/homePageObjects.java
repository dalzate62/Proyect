package co.despegar.com.pageObjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.despegar.com.co/")
public class homePageObjects extends PageObject {
    By txtCity = By.xpath("//input[@placeholder=\"Ingresa una ciudad, alojamiento o punto de interés\"]");

    By btnCity = By.xpath("/html/body/div[10]/div/div[1]/ul/li[1]");
    By dateEntrance = By.xpath("//input[@placeholder=\"Entrada\"]");

    By dateExit = By.xpath("//input[@placeholder=\"Salida\"]");

    By btnSearch = By.xpath("//*[@id=\"searchbox-sbox-box-vacationrentals\"]/div/div/div/div/div[3]/button");

    public By getTxtCity() {
        return txtCity;
    }

    public void setTxtCity(By txtCity) {
        this.txtCity = txtCity;
    }

    public By getDateEntrance() {
        return dateEntrance;
    }

    public void setDateEntrance(By dateEntrance) {
        this.dateEntrance = dateEntrance;
    }

    public By getDateExit() {
        return dateExit;
    }

    public void setDateExit(By dateExit) {
        this.dateExit = dateExit;
    }

    public By getBtnCity() {
        return btnCity;
    }

    public void setBtnCity(By btnCity) {
        this.btnCity = btnCity;
    }

    public By getBtnSearch() {
        return btnSearch;
    }
}
