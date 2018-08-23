package com.example.nhatphuong.retrofit.data.model;


import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sonng implements Parcelable{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("last_modified")
    @Expose
    private String lastModified;
    @SerializedName("permalink")
    @Expose
    private String permalink;
    @SerializedName("permalink_url")
    @Expose
    private String permalinkUrl;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("sharing")
    @Expose
    private String sharing;
    @SerializedName("waveform_url")
    @Expose
    private String waveformUrl;
    @SerializedName("stream_url")
    @Expose
    private String streamUrl;
    @SerializedName("uri")
    @Expose
    private String uri;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("artwork_url")
    @Expose
    private String artworkUrl;
    @SerializedName("comment_count")
    @Expose
    private Integer commentCount;
    @SerializedName("commentable")
    @Expose
    private Boolean commentable;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("download_count")
    @Expose
    private Integer downloadCount;
    @SerializedName("downloadable")
    @Expose
    private Boolean downloadable;
    @SerializedName("embeddable_by")
    @Expose
    private String embeddableBy;
    @SerializedName("favoritings_count")
    @Expose
    private Integer favoritingsCount;
    @SerializedName("genre")
    @Expose
    private String genre;
    @SerializedName("isrc")
    @Expose
    private String isrc;
    @SerializedName("label_id")
    @Expose
    private Object labelId;
    @SerializedName("label_name")
    @Expose
    private String labelName;
    @SerializedName("license")
    @Expose
    private String license;
    @SerializedName("original_content_size")
    @Expose
    private Integer originalContentSize;
    @SerializedName("original_format")
    @Expose
    private String originalFormat;
    @SerializedName("playback_count")
    @Expose
    private Integer playbackCount;
    @SerializedName("purchase_title")
    @Expose
    private Object purchaseTitle;
    @SerializedName("purchase_url")
    @Expose
    private Object purchaseUrl;
    @SerializedName("release")
    @Expose
    private String release;
    @SerializedName("release_day")
    @Expose
    private Object releaseDay;
    @SerializedName("release_month")
    @Expose
    private Object releaseMonth;
    @SerializedName("release_year")
    @Expose
    private Object releaseYear;
    @SerializedName("reposts_count")
    @Expose
    private Integer repostsCount;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("streamable")
    @Expose
    private Boolean streamable;
    @SerializedName("tag_list")
    @Expose
    private String tagList;
    @SerializedName("track_type")
    @Expose
    private String trackType;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("likes_count")
    @Expose
    private Integer likesCount;
    @SerializedName("attachments_uri")
    @Expose
    private String attachmentsUri;
    @SerializedName("bpm")
    @Expose
    private Object bpm;
    @SerializedName("key_signature")
    @Expose
    private String keySignature;
    @SerializedName("user_favorite")
    @Expose
    private Boolean userFavorite;
    @SerializedName("user_playback_count")
    @Expose
    private Object userPlaybackCount;
    @SerializedName("video_url")
    @Expose
    private Object videoUrl;
    @SerializedName("download_url")
    @Expose
    private Object downloadUrl;

    protected Sonng(Parcel in) {
        if (in.readByte() == 0) {
            id = null;
        } else {
            id = in.readInt();
        }
        kind = in.readString();
        createdAt = in.readString();
        lastModified = in.readString();
        permalink = in.readString();
        permalinkUrl = in.readString();
        title = in.readString();
        if (in.readByte() == 0) {
            duration = null;
        } else {
            duration = in.readInt();
        }
        sharing = in.readString();
        waveformUrl = in.readString();
        streamUrl = in.readString();
        uri = in.readString();
        if (in.readByte() == 0) {
            userId = null;
        } else {
            userId = in.readInt();
        }
        artworkUrl = in.readString();
        if (in.readByte() == 0) {
            commentCount = null;
        } else {
            commentCount = in.readInt();
        }
        byte tmpCommentable = in.readByte();
        commentable = tmpCommentable == 0 ? null : tmpCommentable == 1;
        description = in.readString();
        if (in.readByte() == 0) {
            downloadCount = null;
        } else {
            downloadCount = in.readInt();
        }
        byte tmpDownloadable = in.readByte();
        downloadable = tmpDownloadable == 0 ? null : tmpDownloadable == 1;
        embeddableBy = in.readString();
        if (in.readByte() == 0) {
            favoritingsCount = null;
        } else {
            favoritingsCount = in.readInt();
        }
        genre = in.readString();
        isrc = in.readString();
        labelName = in.readString();
        license = in.readString();
        if (in.readByte() == 0) {
            originalContentSize = null;
        } else {
            originalContentSize = in.readInt();
        }
        originalFormat = in.readString();
        if (in.readByte() == 0) {
            playbackCount = null;
        } else {
            playbackCount = in.readInt();
        }
        release = in.readString();
        if (in.readByte() == 0) {
            repostsCount = null;
        } else {
            repostsCount = in.readInt();
        }
        state = in.readString();
        byte tmpStreamable = in.readByte();
        streamable = tmpStreamable == 0 ? null : tmpStreamable == 1;
        tagList = in.readString();
        trackType = in.readString();
        if (in.readByte() == 0) {
            likesCount = null;
        } else {
            likesCount = in.readInt();
        }
        attachmentsUri = in.readString();
        keySignature = in.readString();
        byte tmpUserFavorite = in.readByte();
        userFavorite = tmpUserFavorite == 0 ? null : tmpUserFavorite == 1;
    }

    public static final Creator<Sonng> CREATOR = new Creator<Sonng>() {
        @Override
        public Sonng createFromParcel(Parcel in) {
            return new Sonng(in);
        }

        @Override
        public Sonng[] newArray(int size) {
            return new Sonng[size];
        }
    };

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getPermalinkUrl() {
        return permalinkUrl;
    }

    public void setPermalinkUrl(String permalinkUrl) {
        this.permalinkUrl = permalinkUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getSharing() {
        return sharing;
    }

    public void setSharing(String sharing) {
        this.sharing = sharing;
    }

    public String getWaveformUrl() {
        return waveformUrl;
    }

    public void setWaveformUrl(String waveformUrl) {
        this.waveformUrl = waveformUrl;
    }

    public String getStreamUrl() {
        return streamUrl;
    }

    public void setStreamUrl(String streamUrl) {
        this.streamUrl = streamUrl;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getArtworkUrl() {
        return artworkUrl;
    }

    public void setArtworkUrl(String artworkUrl) {
        this.artworkUrl = artworkUrl;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Boolean getCommentable() {
        return commentable;
    }

    public void setCommentable(Boolean commentable) {
        this.commentable = commentable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
    }

    public Boolean getDownloadable() {
        return downloadable;
    }

    public void setDownloadable(Boolean downloadable) {
        this.downloadable = downloadable;
    }

    public String getEmbeddableBy() {
        return embeddableBy;
    }

    public void setEmbeddableBy(String embeddableBy) {
        this.embeddableBy = embeddableBy;
    }

    public Integer getFavoritingsCount() {
        return favoritingsCount;
    }

    public void setFavoritingsCount(Integer favoritingsCount) {
        this.favoritingsCount = favoritingsCount;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getIsrc() {
        return isrc;
    }

    public void setIsrc(String isrc) {
        this.isrc = isrc;
    }

    public Object getLabelId() {
        return labelId;
    }

    public void setLabelId(Object labelId) {
        this.labelId = labelId;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Integer getOriginalContentSize() {
        return originalContentSize;
    }

    public void setOriginalContentSize(Integer originalContentSize) {
        this.originalContentSize = originalContentSize;
    }

    public String getOriginalFormat() {
        return originalFormat;
    }

    public void setOriginalFormat(String originalFormat) {
        this.originalFormat = originalFormat;
    }

    public Integer getPlaybackCount() {
        return playbackCount;
    }

    public void setPlaybackCount(Integer playbackCount) {
        this.playbackCount = playbackCount;
    }

    public Object getPurchaseTitle() {
        return purchaseTitle;
    }

    public void setPurchaseTitle(Object purchaseTitle) {
        this.purchaseTitle = purchaseTitle;
    }

    public Object getPurchaseUrl() {
        return purchaseUrl;
    }

    public void setPurchaseUrl(Object purchaseUrl) {
        this.purchaseUrl = purchaseUrl;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public Object getReleaseDay() {
        return releaseDay;
    }

    public void setReleaseDay(Object releaseDay) {
        this.releaseDay = releaseDay;
    }

    public Object getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(Object releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    public Object getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Object releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Integer getRepostsCount() {
        return repostsCount;
    }

    public void setRepostsCount(Integer repostsCount) {
        this.repostsCount = repostsCount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Boolean getStreamable() {
        return streamable;
    }

    public void setStreamable(Boolean streamable) {
        this.streamable = streamable;
    }

    public String getTagList() {
        return tagList;
    }

    public void setTagList(String tagList) {
        this.tagList = tagList;
    }

    public String getTrackType() {
        return trackType;
    }

    public void setTrackType(String trackType) {
        this.trackType = trackType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(Integer likesCount) {
        this.likesCount = likesCount;
    }

    public String getAttachmentsUri() {
        return attachmentsUri;
    }

    public void setAttachmentsUri(String attachmentsUri) {
        this.attachmentsUri = attachmentsUri;
    }

    public Object getBpm() {
        return bpm;
    }

    public void setBpm(Object bpm) {
        this.bpm = bpm;
    }

    public String getKeySignature() {
        return keySignature;
    }

    public void setKeySignature(String keySignature) {
        this.keySignature = keySignature;
    }

    public Boolean getUserFavorite() {
        return userFavorite;
    }

    public void setUserFavorite(Boolean userFavorite) {
        this.userFavorite = userFavorite;
    }

    public Object getUserPlaybackCount() {
        return userPlaybackCount;
    }

    public void setUserPlaybackCount(Object userPlaybackCount) {
        this.userPlaybackCount = userPlaybackCount;
    }

    public Object getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(Object videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Object getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(Object downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (id == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(id);
        }
        dest.writeString(kind);
        dest.writeString(createdAt);
        dest.writeString(lastModified);
        dest.writeString(permalink);
        dest.writeString(permalinkUrl);
        dest.writeString(title);
        if (duration == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(duration);
        }
        dest.writeString(sharing);
        dest.writeString(waveformUrl);
        dest.writeString(streamUrl);
        dest.writeString(uri);
        if (userId == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(userId);
        }
        dest.writeString(artworkUrl);
        if (commentCount == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(commentCount);
        }
        dest.writeByte((byte) (commentable == null ? 0 : commentable ? 1 : 2));
        dest.writeString(description);
        if (downloadCount == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(downloadCount);
        }
        dest.writeByte((byte) (downloadable == null ? 0 : downloadable ? 1 : 2));
        dest.writeString(embeddableBy);
        if (favoritingsCount == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(favoritingsCount);
        }
        dest.writeString(genre);
        dest.writeString(isrc);
        dest.writeString(labelName);
        dest.writeString(license);
        if (originalContentSize == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(originalContentSize);
        }
        dest.writeString(originalFormat);
        if (playbackCount == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(playbackCount);
        }
        dest.writeString(release);
        if (repostsCount == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(repostsCount);
        }
        dest.writeString(state);
        dest.writeByte((byte) (streamable == null ? 0 : streamable ? 1 : 2));
        dest.writeString(tagList);
        dest.writeString(trackType);
        if (likesCount == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(likesCount);
        }
        dest.writeString(attachmentsUri);
        dest.writeString(keySignature);
        dest.writeByte((byte) (userFavorite == null ? 0 : userFavorite ? 1 : 2));
    }

    public class User {

    @SerializedName("avatar_url")
    @Expose
    private String avatarUrl;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("permalink_url")
    @Expose
    private String permalinkUrl;
    @SerializedName("uri")
    @Expose
    private String uri;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("permalink")
    @Expose
    private String permalink;
    @SerializedName("last_modified")
    @Expose
    private String lastModified;

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getPermalinkUrl() {
        return permalinkUrl;
    }

    public void setPermalinkUrl(String permalinkUrl) {
        this.permalinkUrl = permalinkUrl;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }
}}