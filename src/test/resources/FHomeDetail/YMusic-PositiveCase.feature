@YMusicCase-PositiveCase
  Feature: Test functionality Youtube Music Page for positive case

    @TC-YTM-01-Positive-MusicPage
    Scenario: user can play music with type song
      Given user navigate to Homepage Youtube Music
        When user click icon search
          And user search for song
          And user click the song
          And user click filter Songs option
          And user click on the play button
        Then music will start playing

    @TC-YTM-03-Positive-MusicLyricPage
    Scenario: user can play music with type "song" and can see the lyric on Tab Lyric
      Given user navigate to Homepage Youtube Music
      When user click icon search
      And user search for song
      And user click the song
      And user click filter Songs option
      And user click on the play button
      Then the lyric appear on the page

    @TC-YTM-02-Positive-MusicVideoPage
    Scenario: user can play music with type video
      Given user navigate to Homepage Youtube Music
      When user click icon search
      And user search for song
      And user click the song
      And user click filter Videos option
      And user click on the play button
      Then music video will start playing

    @TC-YTM-08-Positive-RepeatMusic
    Scenario: user can repeat playlist music
      Given user navigate to Homepage Youtube Music
      When user click random song on Home
      Then user click repeat button