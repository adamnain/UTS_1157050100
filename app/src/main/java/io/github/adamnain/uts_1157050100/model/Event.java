package io.github.adamnain.uts_1157050100.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Event {

    @SerializedName("idEvent")
    @Expose
    private String idEvent;
    @SerializedName("idSoccerXML")
    @Expose
    private String idSoccerXML;
    @SerializedName("strEvent")
    @Expose
    private String strEvent;
    @SerializedName("strFilename")
    @Expose
    private String strFilename;
    @SerializedName("strSport")
    @Expose
    private String strSport;
    @SerializedName("idLeague")
    @Expose
    private String idLeague;
    @SerializedName("strLeague")
    @Expose
    private String strLeague;
    @SerializedName("strSeason")
    @Expose
    private String strSeason;
    @SerializedName("strDescriptionEN")
    @Expose
    private Object strDescriptionEN;
    @SerializedName("strHomeTeam")
    @Expose
    private String strHomeTeam;
    @SerializedName("strAwayTeam")
    @Expose
    private String strAwayTeam;
    @SerializedName("intHomeScore")
    @Expose
    private String intHomeScore;
    @SerializedName("intRound")
    @Expose
    private String intRound;
    @SerializedName("intAwayScore")
    @Expose
    private String intAwayScore;
    @SerializedName("intSpectators")
    @Expose
    private String intSpectators;
    @SerializedName("strHomeGoalDetails")
    @Expose
    private String strHomeGoalDetails;
    @SerializedName("strHomeRedCards")
    @Expose
    private String strHomeRedCards;
    @SerializedName("strHomeYellowCards")
    @Expose
    private String strHomeYellowCards;
    @SerializedName("strHomeLineupGoalkeeper")
    @Expose
    private String strHomeLineupGoalkeeper;
    @SerializedName("strHomeLineupDefense")
    @Expose
    private String strHomeLineupDefense;
    @SerializedName("strHomeLineupMidfield")
    @Expose
    private String strHomeLineupMidfield;
    @SerializedName("strHomeLineupForward")
    @Expose
    private String strHomeLineupForward;
    @SerializedName("strHomeLineupSubstitutes")
    @Expose
    private String strHomeLineupSubstitutes;
    @SerializedName("strHomeFormation")
    @Expose
    private String strHomeFormation;
    @SerializedName("strAwayRedCards")
    @Expose
    private String strAwayRedCards;
    @SerializedName("strAwayYellowCards")
    @Expose
    private String strAwayYellowCards;
    @SerializedName("strAwayGoalDetails")
    @Expose
    private String strAwayGoalDetails;
    @SerializedName("strAwayLineupGoalkeeper")
    @Expose
    private String strAwayLineupGoalkeeper;
    @SerializedName("strAwayLineupDefense")
    @Expose
    private String strAwayLineupDefense;
    @SerializedName("strAwayLineupMidfield")
    @Expose
    private String strAwayLineupMidfield;
    @SerializedName("strAwayLineupForward")
    @Expose
    private String strAwayLineupForward;
    @SerializedName("strAwayLineupSubstitutes")
    @Expose
    private String strAwayLineupSubstitutes;
    @SerializedName("strAwayFormation")
    @Expose
    private String strAwayFormation;
    @SerializedName("intHomeShots")
    @Expose
    private String intHomeShots;
    @SerializedName("intAwayShots")
    @Expose
    private String intAwayShots;
    @SerializedName("dateEvent")
    @Expose
    private String dateEvent;
    @SerializedName("strDate")
    @Expose
    private String strDate;
    @SerializedName("strTime")
    @Expose
    private String strTime;
    @SerializedName("strTVStation")
    @Expose
    private Object strTVStation;
    @SerializedName("idHomeTeam")
    @Expose
    private String idHomeTeam;
    @SerializedName("idAwayTeam")
    @Expose
    private String idAwayTeam;
    @SerializedName("strResult")
    @Expose
    private Object strResult;
    @SerializedName("strCircuit")
    @Expose
    private Object strCircuit;
    @SerializedName("strCountry")
    @Expose
    private Object strCountry;
    @SerializedName("strCity")
    @Expose
    private Object strCity;
    @SerializedName("strPoster")
    @Expose
    private Object strPoster;
    @SerializedName("strFanart")
    @Expose
    private Object strFanart;
    @SerializedName("strThumb")
    @Expose
    private Object strThumb;
    @SerializedName("strBanner")
    @Expose
    private Object strBanner;
    @SerializedName("strMap")
    @Expose
    private Object strMap;
    @SerializedName("strLocked")
    @Expose
    private String strLocked;

    /**
     * No args constructor for use in serialization
     *
     */
    public Event() {
    }

    /**
     *
     * @param strLocked
     * @param strDescriptionEN
     * @param strAwayYellowCards
     * @param strAwayLineupForward
     * @param strHomeLineupDefense
     * @param strCity
     * @param intAwayShots
     * @param idAwayTeam
     * @param strSeason
     * @param idSoccerXML
     * @param strHomeLineupForward
     * @param strResult
     * @param strHomeYellowCards
     * @param strBanner
     * @param idEvent
     * @param strDate
     * @param strAwayLineupDefense
     * @param dateEvent
     * @param strEvent
     * @param strAwayGoalDetails
     * @param strAwayFormation
     * @param strFilename
     * @param strHomeLineupSubstitutes
     * @param strAwayLineupGoalkeeper
     * @param strAwayLineupMidfield
     * @param strHomeFormation
     * @param strHomeLineupMidfield
     * @param idLeague
     * @param strHomeTeam
     * @param strAwayRedCards
     * @param intHomeShots
     * @param strThumb
     * @param intRound
     * @param strTVStation
     * @param strTime
     * @param strLeague
     * @param intSpectators
     * @param strHomeLineupGoalkeeper
     * @param strHomeGoalDetails
     * @param strAwayTeam
     * @param strHomeRedCards
     * @param strFanart
     * @param strSport
     * @param intAwayScore
     * @param strMap
     * @param strCountry
     * @param strCircuit
     * @param intHomeScore
     * @param idHomeTeam
     * @param strAwayLineupSubstitutes
     * @param strPoster
     */
    public Event(String idEvent, String idSoccerXML, String strEvent, String strFilename, String strSport, String idLeague, String strLeague, String strSeason, Object strDescriptionEN, String strHomeTeam, String strAwayTeam, String intHomeScore, String intRound, String intAwayScore, String intSpectators, String strHomeGoalDetails, String strHomeRedCards, String strHomeYellowCards, String strHomeLineupGoalkeeper, String strHomeLineupDefense, String strHomeLineupMidfield, String strHomeLineupForward, String strHomeLineupSubstitutes, String strHomeFormation, String strAwayRedCards, String strAwayYellowCards, String strAwayGoalDetails, String strAwayLineupGoalkeeper, String strAwayLineupDefense, String strAwayLineupMidfield, String strAwayLineupForward, String strAwayLineupSubstitutes, String strAwayFormation, String intHomeShots, String intAwayShots, String dateEvent, String strDate, String strTime, Object strTVStation, String idHomeTeam, String idAwayTeam, Object strResult, Object strCircuit, Object strCountry, Object strCity, Object strPoster, Object strFanart, Object strThumb, Object strBanner, Object strMap, String strLocked) {
        super();
        this.idEvent = idEvent;
        this.idSoccerXML = idSoccerXML;
        this.strEvent = strEvent;
        this.strFilename = strFilename;
        this.strSport = strSport;
        this.idLeague = idLeague;
        this.strLeague = strLeague;
        this.strSeason = strSeason;
        this.strDescriptionEN = strDescriptionEN;
        this.strHomeTeam = strHomeTeam;
        this.strAwayTeam = strAwayTeam;
        this.intHomeScore = intHomeScore;
        this.intRound = intRound;
        this.intAwayScore = intAwayScore;
        this.intSpectators = intSpectators;
        this.strHomeGoalDetails = strHomeGoalDetails;
        this.strHomeRedCards = strHomeRedCards;
        this.strHomeYellowCards = strHomeYellowCards;
        this.strHomeLineupGoalkeeper = strHomeLineupGoalkeeper;
        this.strHomeLineupDefense = strHomeLineupDefense;
        this.strHomeLineupMidfield = strHomeLineupMidfield;
        this.strHomeLineupForward = strHomeLineupForward;
        this.strHomeLineupSubstitutes = strHomeLineupSubstitutes;
        this.strHomeFormation = strHomeFormation;
        this.strAwayRedCards = strAwayRedCards;
        this.strAwayYellowCards = strAwayYellowCards;
        this.strAwayGoalDetails = strAwayGoalDetails;
        this.strAwayLineupGoalkeeper = strAwayLineupGoalkeeper;
        this.strAwayLineupDefense = strAwayLineupDefense;
        this.strAwayLineupMidfield = strAwayLineupMidfield;
        this.strAwayLineupForward = strAwayLineupForward;
        this.strAwayLineupSubstitutes = strAwayLineupSubstitutes;
        this.strAwayFormation = strAwayFormation;
        this.intHomeShots = intHomeShots;
        this.intAwayShots = intAwayShots;
        this.dateEvent = dateEvent;
        this.strDate = strDate;
        this.strTime = strTime;
        this.strTVStation = strTVStation;
        this.idHomeTeam = idHomeTeam;
        this.idAwayTeam = idAwayTeam;
        this.strResult = strResult;
        this.strCircuit = strCircuit;
        this.strCountry = strCountry;
        this.strCity = strCity;
        this.strPoster = strPoster;
        this.strFanart = strFanart;
        this.strThumb = strThumb;
        this.strBanner = strBanner;
        this.strMap = strMap;
        this.strLocked = strLocked;
    }

    public String getIdEvent() {
        return idEvent;
    }

    public String getIdSoccerXML() {
        return idSoccerXML;
    }

    public String getStrEvent() {
        return strEvent;
    }

    public String getStrFilename() {
        return strFilename;
    }

    public String getStrSport() {
        return strSport;
    }

    public String getIdLeague() {
        return idLeague;
    }

    public String getStrLeague() {
        return strLeague;
    }

    public String getStrSeason() {
        return strSeason;
    }

    public Object getStrDescriptionEN() {
        return strDescriptionEN;
    }

    public String getStrHomeTeam() {
        return strHomeTeam;
    }

    public String getStrAwayTeam() {
        return strAwayTeam;
    }

    public String getIntHomeScore() {
        return intHomeScore;
    }

    public String getIntRound() {
        return intRound;
    }

    public String getIntAwayScore() {
        return intAwayScore;
    }

    public String getIntSpectators() {
        return intSpectators;
    }

    public String getStrHomeGoalDetails() {
        return strHomeGoalDetails;
    }

    public String getStrHomeRedCards() {
        return strHomeRedCards;
    }

    public String getStrHomeYellowCards() {
        return strHomeYellowCards;
    }

    public String getStrHomeLineupGoalkeeper() {
        return strHomeLineupGoalkeeper;
    }

    public String getStrHomeLineupDefense() {
        return strHomeLineupDefense;
    }

    public String getStrHomeLineupMidfield() {
        return strHomeLineupMidfield;
    }

    public String getStrHomeLineupForward() {
        return strHomeLineupForward;
    }

    public String getStrHomeLineupSubstitutes() {
        return strHomeLineupSubstitutes;
    }

    public String getStrHomeFormation() {
        return strHomeFormation;
    }

    public String getStrAwayRedCards() {
        return strAwayRedCards;
    }

    public String getStrAwayYellowCards() {
        return strAwayYellowCards;
    }

    public String getStrAwayGoalDetails() {
        return strAwayGoalDetails;
    }

    public String getStrAwayLineupGoalkeeper() {
        return strAwayLineupGoalkeeper;
    }

    public String getStrAwayLineupDefense() {
        return strAwayLineupDefense;
    }

    public String getStrAwayLineupMidfield() {
        return strAwayLineupMidfield;
    }

    public String getStrAwayLineupForward() {
        return strAwayLineupForward;
    }

    public String getStrAwayLineupSubstitutes() {
        return strAwayLineupSubstitutes;
    }

    public String getStrAwayFormation() {
        return strAwayFormation;
    }

    public String getIntHomeShots() {
        return intHomeShots;
    }

    public String getIntAwayShots() {
        return intAwayShots;
    }

    public String getDateEvent() {
        return dateEvent;
    }

    public String getStrDate() {
        return strDate;
    }

    public String getStrTime() {
        return strTime;
    }

    public Object getStrTVStation() {
        return strTVStation;
    }

    public String getIdHomeTeam() {
        return idHomeTeam;
    }

    public String getIdAwayTeam() {
        return idAwayTeam;
    }

    public Object getStrResult() {
        return strResult;
    }

    public Object getStrCircuit() {
        return strCircuit;
    }

    public Object getStrCountry() {
        return strCountry;
    }

    public Object getStrCity() {
        return strCity;
    }

    public Object getStrPoster() {
        return strPoster;
    }

    public Object getStrFanart() {
        return strFanart;
    }


    public Object getStrThumb() {
        return strThumb;
    }

    public Object getStrBanner() {
        return strBanner;
    }


    public Object getStrMap() {
        return strMap;
    }

    public String getStrLocked() {
        return strLocked;
    }


}