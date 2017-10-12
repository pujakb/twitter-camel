package com.backBenchers.twitter;

import java.util.List;

import org.apache.commons.io.IOUtils;

import twitter4j.*;
import twitter4j.auth.AccessToken;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.backBenchers.twitter.service.TwitterAPIService;


public class TwitterAPIPostTweetBean extends TwitterAPIConfig {
	
	private static final Logger LOG = LoggerFactory.getLogger(TwitterAPIPostTweetBean.class);
	
	private TwitterAPIService twitterAPIService;
	
	public TwitterAPIPostTweetBean(TwitterAPIService twitterAPIService) {
		this.twitterAPIService=twitterAPIService;
	}
	 
	public String postTweet(String param) {
		return twitterAPIService.postTweet(param);
	}
	
	/*
	public static void main(String args[]) {
			TwitterAPIPostTweetBean o = new TwitterAPIPostTweetBean();
			System.out.println(o.postTweet("Testing "));
		}
	*/	
//	
}