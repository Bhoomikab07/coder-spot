package com.xworkz.socialmedia.external;

import com.xworkz.socialmedia.event.CheckNameException;
import com.xworkz.socialmedia.internal.SocialMediaInternal;

public class SocialMediaRunner {
    public static void main(String[] args) {
        SocialMediaInternal socialMediaInternal = new SocialMediaInternal();
        socialMediaInternal.checkName("Bhoomika");
        socialMediaInternal.checkId(10);
        socialMediaInternal.checkNumber(100);
        socialMediaInternal.checkProfile("Bhoomi");
        socialMediaInternal.checkUser("Bhanu");
    }
}
