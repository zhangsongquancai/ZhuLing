package com.itant.zhuling.event.music;

/**
 * Created by iTant on 2017/4/22.
 */

public class MusicEvent {
    public static final int MUSIC_EVENT_PLAY                = 1;// 用户点击搜索结果的item，要播放音乐
    public static final int MUSIC_EVENT_DOWNLOAD_BROWSER    = 2;// 用户点击使用浏览器进行下载
    public static final int MUSIC_EVENT_DOWNLOAD            = 3;// 用户点击下载
    public static final int MUSIC_EVENT_COPY                = 4;// 用户点击复制下载链接
    public static final int MUSIC_EVENT_SHARE               = 5;// 用户点击分享下载链接
}
