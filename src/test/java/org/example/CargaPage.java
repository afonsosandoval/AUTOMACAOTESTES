package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CargaPage {

    private static final String url_page = "https://careers.emeal.nttdata.com/s/jobs?language=pt_BR&pcountry=Brasil";

    private WebDriver browser;

    public CargaPage(){
        System.setProperty("webdriver.chrome.driver", "c:\\Drivers");
        this.browser = new ChromeDriver();
        this.browser.navigate().to(url_page);

    }
    public boolean isPaginaCorreta() {

        return browser.getCurrentUrl().contains(url_page);
    }
   public boolean verificaContemTextoTitulo(){
       return browser.getPageSource().contains("Jobs");
   }

   public void preencherPesquisa(String Pesquisa){
        browser.findElement(By.id("sGlobal")).sendKeys(Pesquisa);
   }
   public void executarPesquisa(){
        browser.findElement(By.className("btn-search")).submit();
   }

   public boolean verificaSePesquisouPaginaCorreta(String resultado){
        return browser.getPageSource().contains(resultado);
   }
    public void fechar() { browser.quit(); }
}
