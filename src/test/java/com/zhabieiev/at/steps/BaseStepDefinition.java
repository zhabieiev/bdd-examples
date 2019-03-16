package com.zhabieiev.at.steps;

import com.zhabieiev.at.component.pages.Pages;

import org.apache.commons.lang3.StringUtils;

import static com.zhabieiev.at.utils.WebDriverUtils.getWebDriverInstance;

class BaseStepDefinition
{
    private static final String DEFAULT_BASE_URL = "http://www.ukr.net/";

    Pages pages = new Pages(getWebDriverInstance(), getBaseAppUrl());

    static String getBaseAppUrl()
    {
        String baseApp = System.getenv("BASE_WEB_APP");
        if(StringUtils.isNotBlank(baseApp))
        {
            return baseApp;
        }
        return DEFAULT_BASE_URL;
    }

}
