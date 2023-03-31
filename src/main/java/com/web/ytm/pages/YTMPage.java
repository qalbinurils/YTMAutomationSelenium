package com.web.ytm.pages;

import com.web.ytm.base.BaseSetup;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class YTMPage extends BaseSetup {
    YTMPage ytmPage;
    WebDriverWait wait = new WebDriverWait(driver, 5, 5);

    public YTMPage(){
        PageFactory.initElements(driver, "https://music.youtube.com/");
    }

    // Element Locator or Selector YTM
    By click_icon_search = By.xpath("//*[@id=\"placeholder\"]");
    By click_random_song = By.xpath("//*[@id=\"play-button\"]");
    By input_Search = By.xpath("//input[@aria-expanded='true']");
    By input_SearchNoLyric = By.xpath("//input[@aria-expanded='true']");
    By click_song = By.cssSelector("yt-formatted-string[id='suggestion-cell-0x0'] span[class$='yt-formatted-string']");
    By click_Filter_Song = By.xpath("//a[contains(@title, 'song')]");
    By click_Filter_Video = By.xpath("//a[contains(@title, 'video')]");
    By click_play_button = By.cssSelector("#contents > ytmusic-responsive-list-item-renderer:nth-child(1) > div.flex-columns.style-scope.ytmusic-responsive-list-item-renderer > div.title-column.style-scope.ytmusic-responsive-list-item-renderer > yt-formatted-string > a");
    By click_repeat_btn = By.xpath("//*[@id=\"right-controls\"]/div/tp-yt-paper-icon-button[2]");
   By verify_playmusic = By.xpath("//*[contains(@class,'time-info style-scope ytmusic-player-bar')]");
    By verify_lyric = By.xpath("//*[contains(@class,'content style-scope ytmusic-player-page')]");
    By verify_repeat = By.xpath("//*[contains(@title, 'Repeat all')]");



    // @TC-YTM-03-Positive-LyricPage
    public void setClick_icon_search(){
        WebElement clickIconSearch = wait.until(ExpectedConditions.elementToBeClickable(click_icon_search));
        clickIconSearch.click();
    }
    public void inputSearch() {
        WebElement inputSearchName = wait.until(ExpectedConditions.presenceOfElementLocated(input_Search));
        inputSearchName.sendKeys("payphone");
    }
    public void inputSearchNoLyric(){
        WebElement inputIconSeachNolyric = wait.until(ExpectedConditions.presenceOfElementLocated(input_SearchNoLyric));
        inputIconSeachNolyric.sendKeys("oh asmara kobo");
    }
    public void clickSong() {
        WebElement clickSongs = wait.until(ExpectedConditions.elementToBeClickable(click_song));
        clickSongs.click();
    }
    public void setClick_Filter_Song(){
        WebElement clickFilterSong = wait.until(ExpectedConditions.elementToBeClickable(click_Filter_Song));
        clickFilterSong.click();
    }
    public void setClick_Filter_Video(){
        WebElement clickFilterVideo = wait.until(ExpectedConditions.elementToBeClickable(click_Filter_Video));
        clickFilterVideo.click();
    }
    public void setClick_play_button(){
        WebElement clickPlayButton = wait.until(ExpectedConditions.elementToBeClickable(click_play_button));
        clickPlayButton.click();
    }
    public void setClick_random_song(){
        WebElement clickRandomSong = wait.until(ExpectedConditions.elementToBeClickable(click_random_song));
        clickRandomSong.click();
    }
    public void setClick_repeat_btn(){
        WebElement clickRepeatBtn = wait.until(ExpectedConditions.elementToBeClickable(click_repeat_btn));
        clickRepeatBtn.click();
    }
    public void setVerify_playmusic(){
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(verify_playmusic)).isDisplayed());
    }
    public void verifySuccessReadLyric(){
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(verify_lyric)).isDisplayed());
    }
   public void setVerify_repeat(){
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(verify_repeat)).isDisplayed());
    }

    //get element failed
    //public void setClick_tab_lyrics(){
    //    WebElement clickTabLyric = wait.until(ExpectedConditions.elementToBeClickable(click_tab_lyrics));
    //    clickTabLyric.click();
    //}

}
