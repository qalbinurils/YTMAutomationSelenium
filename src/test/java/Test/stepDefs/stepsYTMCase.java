package Test.stepDefs;

import com.web.ytm.base.BaseSetup;
import com.web.ytm.pages.YTMPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.jsoup.internal.FieldsAreNonnullByDefault;
import org.junit.Assert;

public class stepsYTMCase extends BaseSetup {

    YTMPage ytmPage;

    //@TC-YTM-01-Positive-MusicPage
    //@TC-YTM-02-Positive-MusicVideoPage
    //@TC-YTM-03-Positive-MusicLyricPage
    //Scenario: user can play music with type song,videos
    @Given("user navigate to Homepage Youtube Music")
    public void user_navigate_to_Homepage_Youtube_Music() throws Exception {
        initialization();
        ytmPage = new YTMPage();
        Thread.sleep(1500);
    }

    @When("user click icon search")
    public void user_click_icon_search(){
        ytmPage.setClick_icon_search();
    }

    @And("user search for song")
    public void user_search_for_song() throws Exception{
        ytmPage.inputSearch();
        Thread.sleep(2000);
    }

    @And("user click the song")
    public void user_click_the_song() throws Exception{
        Thread.sleep(2000);
        ytmPage.clickSong();
    }

    @And("user click filter Songs option")
    public void user_click_filter_Songs_options() throws Exception{
        Thread.sleep(2500);
        ytmPage.setClick_Filter_Song();
    }

    @And("user click on the play button")
    public void user_click_on_the_play_button()throws Exception{
        ytmPage.setClick_play_button();
        Thread.sleep(9000);
    }

    @Then("music will start playing")
    public void music_will_start_playing() throws Exception{
        Thread.sleep(1000);
        ytmPage.setVerify_playmusic();
        driver.quit();
    }

    @Then("music video will start playing")
    public void music_video_will_start_playing() throws Exception{
        Thread.sleep(1500);
        ytmPage.setVerify_playmusic();
        driver.quit();
    }

    //@TC-YTM-03-Positive-MusicLyricPage
    //Scenario: user can play music with type "song" and can see the lyric on Tab Lyric
    @Then("the lyric appear on the page")
    public void the_lyric_appear_on_the_page() throws Exception{
        Thread.sleep(8000);
        ytmPage.verifySuccessReadLyric();
        driver.quit();
    }

    //@TC-YTM-02-Positive-MusicVideoPage
    //Scenario: user can play music with type video
    @And("user click filter Videos option")
    public void user_click_filter_Videos_option() throws Exception{
        Thread.sleep(5000);
        ytmPage.setClick_Filter_Video();
    }

    @When("user click random song on Home")
    public void user_click_random_song_on_Home() {
        ytmPage.setClick_random_song();
    }

    @And("user click repeat button")
    public void user_click_repeat_button() {
        ytmPage.setClick_repeat_btn();
        driver.quit();
    }

    @Then("list music will play in repeat mode")
    public void list_music_will_play_in_repeat_mode() throws Exception{
        Thread.sleep(8000);
        ytmPage.setVerify_repeat();
        driver.quit();
    }
}
