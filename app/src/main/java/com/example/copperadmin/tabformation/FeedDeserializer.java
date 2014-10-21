package com.example.copperadmin.tabformation;

import android.util.Log;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Amr Gharseldin on 10/20/2014.
 */
public class FeedDeserializer implements JsonDeserializer<ArrayList<Feed>> {

    private static final String TAG = "FeedDeserializer";

    @Override
    public ArrayList<Feed> deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final ArrayList<Feed> feeds = new ArrayList<Feed>();

        final JsonObject jsonObject = jsonElement.getAsJsonObject();
        final JsonElement jsonDataElement = jsonObject.get("data");
        final JsonObject jsonDataObject =jsonDataElement.getAsJsonObject();
        final JsonArray jsonDataArray = jsonDataObject.getAsJsonArray("activities");

        for (int i =0; i<jsonDataArray.size(); i++){

            Feed activityFeed = new Feed();

            JsonElement activitiesArrayElement = jsonDataArray.get(i);
            JsonObject  activitiesArrayObject = activitiesArrayElement.getAsJsonObject();



            JsonElement aggregateCountElement = activitiesArrayObject.get("aggregateCount");
            String aggregateCountString = aggregateCountElement.getAsString();
            activityFeed.setAggregateCount(aggregateCountString);

            JsonElement categoryElement = activitiesArrayObject.get("category");
            String categoryString = categoryElement.getAsString();
            activityFeed.setCategory(categoryString);

//        	JsonElement commTypeElement = activitiesArrayObject.get("commType");
//        	String commTypeString = commTypeElement.getAsString();
//        	activityFeed.setCommType(commTypeString);

            JsonElement idElement = activitiesArrayObject.get("id");
            String idString = idElement.getAsString();
            activityFeed.setId(idString);

            JsonElement matchFirstNameElement = activitiesArrayObject.get("matchFirstName");
            String matchFirstNameString = matchFirstNameElement.getAsString();
            activityFeed.setMatchFirstName(matchFirstNameString);

            JsonElement matchIdElement = activitiesArrayObject.get("matchId");
            String matchIdString = matchIdElement.getAsString();
            activityFeed.setMatchId(matchIdString);

            JsonElement matchLocationElement = activitiesArrayObject.get("matchLocation");
            String matchLocationString = matchLocationElement.getAsString();
            activityFeed.setLocation(matchLocationString);

            JsonElement matchPpyRecipientElement = activitiesArrayObject.get("matchPpyRecipient");
            boolean matchPpyRecipientBoolean = matchPpyRecipientElement.getAsBoolean();
            activityFeed.setMatchPpyRecipient(matchPpyRecipientBoolean);

            JsonElement matchUserIdElement = activitiesArrayObject.get("matchUserId");
            String matchUserIdString = matchUserIdElement.getAsString();
            activityFeed.setMatchUserId(matchUserIdString);

            JsonElement messageTextElement = activitiesArrayObject.get("messageText");
            String messageTextString = messageTextElement.getAsString();
            activityFeed.setMessageText(messageTextString);

            JsonElement photoHeightElement = activitiesArrayObject.get("photoHeight");
            int photoHeightInteger = photoHeightElement.getAsInt();
            activityFeed.setPhotoHeight(photoHeightInteger);

            JsonElement photoURLElement = activitiesArrayObject.get("photoURL");
            String photoURLString = photoURLElement.getAsString();
            activityFeed.setPhotoURL(photoURLString);

//        	JsonElement photoUrlsElement = activitiesArrayObject.get("photoUrls");
//        	String photoUrlsString = photoUrlsElement.getAsString();
//        	activityFeed.setPhotoUrls(photoUrlsString);

            JsonElement photoWidthElement = activitiesArrayObject.get("photoWidth");
            int photoWidthInteger = photoWidthElement.getAsInt();
            activityFeed.setPhotoWidth(photoWidthInteger);

            JsonElement ratingValueElement = activitiesArrayObject.get("ratingValue");
            String ratingValueString = ratingValueElement.getAsString();
            activityFeed.setRatingValue(ratingValueString);

            JsonElement resourceIdElement = activitiesArrayObject.get("resourceId");
            String resourceIdString = resourceIdElement.getAsString();
            activityFeed.setResourceId(resourceIdString);

            JsonElement resourceTypeElement = activitiesArrayObject.get("resourceType");
            String resourceTypeString = resourceTypeElement.getAsString();
            activityFeed.setResourceType(resourceTypeString);

            JsonElement resourceValueElement = activitiesArrayObject.get("resourceValue");
            String resourceValueString = resourceValueElement.getAsString();
            activityFeed.setResourceValue(resourceValueString);

//        	JsonElement reviewedDateElement = activitiesArrayObject.get("reviewedDate");
//        	String reviewedDateString = reviewedDateElement.getAsString();
//        	activityFeed.setReviewedDate(reviewedDateString);

//        	JsonElement secureCallNumberElement = activitiesArrayObject.get("secureCallNumber");
//        	String secureCallNumberString = secureCallNumberElement.getAsString();
//        	activityFeed.setLocation(secureCallNumberString);

            //retrieving thumb nail photo info
            JsonElement thumbPhotoElement = activitiesArrayObject.get("thumbPhoto");
            JsonObject thumbPhotoObject = thumbPhotoElement.getAsJsonObject();

            JsonElement thumbHeightElement = thumbPhotoObject.get("height");
            int thumbHeightInteger = thumbHeightElement.getAsInt();
            activityFeed.setThumbPhotoHeight(thumbHeightInteger);

            JsonElement thumbphotoIndexElement = thumbPhotoObject.get("photoIndex");
            int thumbphotoIndexInteger = thumbphotoIndexElement.getAsInt();
            activityFeed.setThumbPhotoIndex(thumbphotoIndexInteger);

            JsonElement thumbPhotoUrlElement = thumbPhotoObject.get("photoUrl");
            String thumbPhotoUrlString = thumbPhotoUrlElement.getAsString();
            activityFeed.setThumbPhotoURL(thumbPhotoUrlString);

            JsonElement thumbWidthElement = thumbPhotoObject.get("width");
            int thumbWidthInteger = thumbWidthElement.getAsInt();
            activityFeed.setThumbPhotoWidth(thumbWidthInteger);


            JsonElement timeStampElement = activitiesArrayObject.get("timeStamp");
            String timeStampString = timeStampElement.getAsString();

            try{
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS");
                Date parsedDate = dateFormat.parse(timeStampString);
                Calendar feedDate = Calendar.getInstance();
                feedDate.setTime(parsedDate);
                activityFeed.setFeedDate(feedDate);

            }catch(Exception e){
                e.printStackTrace();
            }
            Log.d(TAG,activityFeed.toString());
            feeds.add(activityFeed);
        }
        return feeds;
    }
}
