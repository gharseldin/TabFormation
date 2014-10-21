package com.example.copperadmin.tabformation;

/**
 * Created by Copper Admin on 10/20/2014.
 */
import java.util.Calendar;

public class Feed {

    private String mAggregateCount;
    private String mCategory;
    private String mCommType;
    private String mId;
    private String mMatchFirstName;
    private String mMatchId;
    private Calendar mFeedDate;
    private String mMatchCity;
    private String mMatchState;
    private boolean mMatchPpyRecipient;
    private String mMatchUserId;
    private String mMessageText;
    private int mPhotoHeight;
    private int mPhotoWidth;
    private String mPhotoURL;
    private String mPhotoUrls;
    private String mRatingValue;
    private String mResourceId;
    private String mResourceType;
    private String mResourceValue;
    private String mReviewedDate;
    private String mSecureCallNumber;
    private int mThumbPhotoHeight;
    private int mThumbPhotoWidth;
    private String mThumbPhotoURL;
    private int mThumbPhotoIndex;

    public Feed() {
        mFeedDate = Calendar.getInstance();
    }

    // splits the location String and saves the city and state in separate
    // fields
    public void setLocation(String location) {
        String[] locationDetails = location.split(",");
        setMatchCity(locationDetails[0].trim());
        setMatchState(locationDetails[1].trim());
    }

    public String getStringDate(){
        return mFeedDate.get(Calendar.YEAR)+" , "
                +mFeedDate.get(Calendar.MONTH)+" , "
                +mFeedDate.get(Calendar.DAY_OF_MONTH)+" , "
                +mFeedDate.get(Calendar.HOUR_OF_DAY)+" , "
                +mFeedDate.get(Calendar.MINUTE)+" , "
                +mFeedDate.get(Calendar.SECOND)+ "."
                +mFeedDate.get(Calendar.MILLISECOND)+"\n";
    }

    @Override
    public String toString() {
        String returnString = "";
        returnString += "AggregateCount = " + mAggregateCount + "\n";
        returnString += "Category = " + mCategory + "\n";
        returnString += "CommType = " + mCommType + "\n";
        returnString += "Id = " + mId + "\n";
        returnString += "MatchFirstName = " + mMatchFirstName + "\n";
        returnString += "MatchId = " + mMatchId + "\n";
        returnString += getStringDate();
        returnString += "MatchCity = " + mMatchCity + "\n";
        returnString += "MatchState = " + mMatchState + "\n";
        returnString += "MatchPpyRecipient = " + mMatchPpyRecipient + "\n";
        returnString += "MatchUserId = " + mMatchUserId + "\n";
        returnString += "MessageText = " + mMessageText + "\n";
        returnString += "PhotoHeight = " + mPhotoHeight + "\n";
        returnString += "PhotoWidth = " + mPhotoWidth + "\n";
        returnString += "PhotoURL = " + mPhotoURL + "\n";
        returnString += "PhotoUrls = " + mPhotoUrls + "\n";
        returnString += "RatingValue = " + mRatingValue + "\n";
        returnString += "ResourceId = " + mResourceId + "\n";
        returnString += "ResourceType = " + mResourceType + "\n";
        returnString += "ResourceValue = " + mResourceValue + "\n";
        returnString += "ReviewedDate = " + mReviewedDate + "\n";
        returnString += "SecureCallNumber = " + mSecureCallNumber + "\n";
        returnString += "ThumbPhotoHeight = " + mThumbPhotoHeight + "\n";
        returnString += "ThumbPhotoWidth = " + mThumbPhotoWidth + "\n";
        returnString += "ThumbPhotoURL = " + mThumbPhotoURL + "\n";
        returnString += "ThumbPhotoIndex = " + mThumbPhotoIndex + "\n";

        return returnString;
    }

    public String getAggregateCount() {
        return mAggregateCount;
    }

    public void setAggregateCount(String aggregateCount) {
        mAggregateCount = aggregateCount;
    }

    public String getCategory() {
        return mCategory;
    }

    public void setCategory(String category) {
        mCategory = category;
    }

    public String getCommType() {
        return mCommType;
    }

    public void setCommType(String commType) {
        mCommType = commType;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getMatchFirstName() {
        return mMatchFirstName;
    }

    public void setMatchFirstName(String matchFirstName) {
        mMatchFirstName = matchFirstName;
    }

    public String getMatchId() {
        return mMatchId;
    }

    public void setMatchId(String matchId) {
        mMatchId = matchId;
    }

    public Calendar getFeedDate() {
        return mFeedDate;
    }

    public void setFeedDate(Calendar feedDate) {
        mFeedDate = feedDate;
    }

    public String getMatchCity() {
        return mMatchCity;
    }

    public void setMatchCity(String matchCity) {
        mMatchCity = matchCity;
    }

    public String getMatchState() {
        return mMatchState;
    }

    public void setMatchState(String matchState) {
        mMatchState = matchState;
    }

    public boolean isMatchPpyRecipient() {
        return mMatchPpyRecipient;
    }

    public void setMatchPpyRecipient(boolean matchPpyRecipient) {
        mMatchPpyRecipient = matchPpyRecipient;
    }

    public String getMatchUserId() {
        return mMatchUserId;
    }

    public void setMatchUserId(String matchUserId) {
        mMatchUserId = matchUserId;
    }

    public String getMessageText() {
        return mMessageText;
    }

    public void setMessageText(String messageText) {
        mMessageText = messageText;
    }

    public int getPhotoHeight() {
        return mPhotoHeight;
    }

    public void setPhotoHeight(int photoHeight) {
        mPhotoHeight = photoHeight;
    }

    public int getPhotoWidth() {
        return mPhotoWidth;
    }

    public void setPhotoWidth(int photoWidth) {
        mPhotoWidth = photoWidth;
    }

    public String getPhotoURL() {
        return mPhotoURL;
    }

    public void setPhotoURL(String photoURL) {
        mPhotoURL = photoURL;
    }

    public String getPhotoUrls() {
        return mPhotoUrls;
    }

    public void setPhotoUrls(String photoUrls) {
        mPhotoUrls = photoUrls;
    }

    public String getRatingValue() {
        return mRatingValue;
    }

    public void setRatingValue(String ratingValue) {
        mRatingValue = ratingValue;
    }

    public String getResourceId() {
        return mResourceId;
    }

    public void setResourceId(String resourceId) {
        mResourceId = resourceId;
    }

    public String getResourceType() {
        return mResourceType;
    }

    public void setResourceType(String resourceType) {
        mResourceType = resourceType;
    }

    public String getResourceValue() {
        return mResourceValue;
    }

    public void setResourceValue(String resourceValue) {
        mResourceValue = resourceValue;
    }

    public String getReviewedDate() {
        return mReviewedDate;
    }

    public void setReviewedDate(String reviewedDate) {
        mReviewedDate = reviewedDate;
    }

    public String getSecureCallNumber() {
        return mSecureCallNumber;
    }

    public void setSecureCallNumber(String secureCallNumber) {
        mSecureCallNumber = secureCallNumber;
    }

    public int getThumbPhotoHeight() {
        return mThumbPhotoHeight;
    }

    public void setThumbPhotoHeight(int thumbPhotoHeight) {
        mThumbPhotoHeight = thumbPhotoHeight;
    }

    public int getThumbPhotoWidth() {
        return mThumbPhotoWidth;
    }

    public void setThumbPhotoWidth(int thumbPhotoWidth) {
        mThumbPhotoWidth = thumbPhotoWidth;
    }

    public String getThumbPhotoURL() {
        return mThumbPhotoURL;
    }

    public void setThumbPhotoURL(String thumbPhotoURL) {
        mThumbPhotoURL = thumbPhotoURL;
    }

    public int getThumbPhotoIndex() {
        return mThumbPhotoIndex;
    }

    public void setThumbPhotoIndex(int thumbPhotoIndex) {
        mThumbPhotoIndex = thumbPhotoIndex;
    }

}
