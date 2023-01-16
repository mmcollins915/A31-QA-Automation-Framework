import org.testng.annotations.Test;

public class SeleniumTechniques extends BaseTest {

}



//throwing an exception A31 L21
@Test
public void playSong() throws InterruptedException {
        login();
        chooseAllSongsList();
        contextClickFirstSong();
        choosePlay();
        Thread.sleep(3000);
        Assert.assertTrue(isSongPlaying());

        }


        public void hoverPlayButton(){
            wait.until(ExpectedConditions.visibilityOfElementLocatedBy) {
                login();
                chooseAllSongs
            }

        }

        @Test
public void renamePlaylist() throws InterrupedException