/**
 * File generated by Magnet rest2mobile 1.1 - Apr 30, 2015 12:51:10 AM
 * @see {@link http://developer.magnet.com}
 */

package com.recycleview.tests.models.magnet.beans;


/**
 * Generated from json example
{
  "kind" : "t3",
  "data" : {
    "domain" : "self.EarthPorn",
    "media_embed" : {
    },
    "subreddit" : "EarthPorn",
    "selftext_html" : "&lt;!--SC_OFF--&gt;&lt;divclass=\"md\"&gt;&lt;p&gt;Thisthreadisintendedtohelpthesubredditcommunicateandgetsomediscussiongoingregardingthestateofthesubreddit,qualityofsubmissions,qualityofmoderation,effectivenessofrulesatachievingthedesiredeffect,andsoon.Feelfreetoaskquestionsaboutphotographyortechniquesusedtocreatetheamazingimagesyouseeinthissubreddit.Alsofeelfreetocommentyourfavouritephotographers,aswellassomeoftheirwork.Pleasenotethatthisthreadisintendedtobeconstructive,sowhenyoucommentpleasetrytooffersuggestionstobalanceyourcritique.&lt;/p&gt;\n\n&lt;p&gt;Pleasesortcommentsby&amp;#39;new&amp;#39;tofindcommentsthatwouldotherwisebeburied.&lt;/p&gt;\n&lt;/div&gt;&lt;!--SC_ON--&gt;",
    "selftext" : "Thisthreadisintendedtohelpthesubredditcommunicateandgetsomediscussiongoingregardingthestateofthesubreddit,qualityofsubmissions,qualityofmoderation,effectivenessofrulesatachievingthedesiredeffect,andsoon.Feelfreetoaskquestionsaboutphotographyortechniquesusedtocreatetheamazingimagesyouseeinthissubreddit.Alsofeelfreetocommentyourfavouritephotographers,aswellassomeoftheirwork.Pleasenotethatthisthreadisintendedtobeconstructive,sowhenyoucommentpleasetrytooffersuggestionstobalanceyourcritique.\n\nPleasesortcommentsby'new'tofindcommentsthatwouldotherwisebeburied.\n",
    "user_reports" : [ ],
    "id" : "3410gr",
    "gilded" : 0,
    "archived" : false,
    "clicked" : false,
    "author" : "AutoModerator",
    "score" : 5,
    "over_18" : false,
    "hidden" : false,
    "thumbnail" : "self",
    "subreddit_id" : "t5_2sbq3",
      ...

 */

public class Child {

  
  private Data data;

  
  private String kind;

  public Data getData() {
    return data;
  }
  public String getKind() {
    return kind;
  }

  /**
  * Builder for Child
  **/
  public static class ChildBuilder {
    private Child toBuild = new Child();

    public ChildBuilder() {
    }

    public Child build() {
      return toBuild;
    }

    public ChildBuilder data(Data value) {
      toBuild.data = value;
      return this;
    }
    public ChildBuilder kind(String value) {
      toBuild.kind = value;
      return this;
    }
  }
}
