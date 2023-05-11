package com.example.youtubeplaylist.Model;

public class Snippet {
    private String publishTime;

    private String publishedAt;

    private String description;

    private String title;

    private Thumbnails thumbnails;

    private String channelId;

    private String channelTitle;

    private String liveBroadcastContent;

    public String getPublishTime ()
    {
        return publishTime;
    }

    public void setPublishTime (String publishTime)
    {
        this.publishTime = publishTime;
    }

    public String getPublishedAt ()
    {
        return publishedAt;
    }

    public void setPublishedAt (String publishedAt)
    {
        this.publishedAt = publishedAt;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public Thumbnails getThumbnails ()
    {
        return thumbnails;
    }

    public void setThumbnails (Thumbnails thumbnails)
    {
        this.thumbnails = thumbnails;
    }

    public String getChannelId ()
    {
        return channelId;
    }

    public void setChannelId (String channelId)
    {
        this.channelId = channelId;
    }

    public String getChannelTitle ()
    {
        return channelTitle;
    }

    public void setChannelTitle (String channelTitle)
    {
        this.channelTitle = channelTitle;
    }

    public String getLiveBroadcastContent ()
    {
        return liveBroadcastContent;
    }

    public void setLiveBroadcastContent (String liveBroadcastContent)
    {
        this.liveBroadcastContent = liveBroadcastContent;
    }
}
