package MainPackage;

import org.openqa.selenium.WebDriver;

public class AllURLs {

    WebDriver driver;

    public AllURLs(WebDriver driver) {
        this.driver = driver;
    }

    // Cookie
    String cookie = "eyJzZXNzaW9uVG9rZW4iOiJyOjM5YTE2Y2Q4YTZiMjRiYzJkNmRlODcxZmFmZjBmODBlIn0=";
    String coinGecko = "https://www.coingecko.com/en";

    // Header
    String mainPage = "https://coinstats.app/";
    String portfolioPage = "https://coinstats.app/en/portfolio/";
    String newsPage = "https://coinstats.app/en/news/";
    String pricingPage = "https://coinstats.app/en/pricing/";
    String report24HPage = "https://coinstats.app/en/market-report/";
    String pressKitPage = "https://coinstats.app/en/press-kit/";
    String APIDocsPage = "https://documenter.getpostman.com/view/5734027/RzZ6Hzr3";
    String blogPage = "https://blog.coinstats.app/";
    String widgetsPage = "https://coinstats.app/en/widgets/";

    // Languages
    String englishMainPage = "https://coinstats.app/en/";
    String germanMainPage = "https://coinstats.app/de/";
    String koreanMainPage = "https://coinstats.app/ko/";
    String japaneseMainPage = "https://coinstats.app/ja/";
    String chineseMainPage = "https://coinstats.app/zh/";
    String spanishMainPage = "https://coinstats.app/es/";
    String frenchMainPage = "https://coinstats.app/fr/";
    String armenianMainPage = "https://coinstats.app/hy/";
    String dutchMainPage = "https://coinstats.app/nl/";
    String russianMainPage = "https://coinstats.app/ru/";
    String italianMainPage = "https://coinstats.app/it/";
    String portugueseMainPage = "https://coinstats.app/pt/";
    String turkishMainPage = "https://coinstats.app/tr/";
    // (CurrentLanguageName == LanguageNameInLink.LowerCase;)

    // GetStarted
    String getStartedPage = "https://coinstats.app/en/login/";
    String signUpWithEmailPage = "https://coinstats.app/en/sign-up/";
    String loginWithEmailPage = "https://coinstats.app/en/login-email/";
    String settingsPage = "https://coinstats.app/en/profile/";
    String forgotPasswordPage = "https://coinstats.app/en/recovery/";

    // Landing
    String landingPage = "https://coinstats.app/en/portfolio-landing";
    String kevinRoseTwitterPage = "https://twitter.com/kevinrose/status/945871166647951362";
    String sebastianGronewoldTwitterPage = "https://twitter.com/sebgronewold";
    String tyDanielSmithTwitterPage = "https://twitter.com/TyDanielSmith";
    String adelTwitterPage = "https://twitter.com/AdeldMeyer";
    String yahooFinancePage = "https://finance.yahoo.com/news/three-best-crypto-portfolio-trackers-152159922.html";
    String cryptoSlatePage = "https://cryptoslate.com/products/coinstats";
    String cryptoGlobePage = "https://www.cryptoglobe.com/latest/2020/02/crypto-portfolio-tracker-coinstats-gets-a-highly-impressive-upgrade/";
    String hackerNoonPage = "https://hackernoon.com/crypto-portfolio-trackers-are-helping-drive-crypto-adoption-forward-df1r3yhi";
    String productHuntPage = "https://www.producthunt.com/posts/coin-stats-2-0";

    // PressKit
    String pressKitLogoForDarkBackgroundSVGPage = "https://static.coinstats.app/presskit/logos/logo_darkbg.svg";
    String pressKitLogoForDarkBackgroundPNGPage = "https://static.coinstats.app/presskit/logos/logo_darkbg.png";
    String pressKitLogoSymbolForDarkAndLightBackgroundsSVGPage = "https://static.coinstats.app/presskit/logos/circle-logo.png";
    String pressKitLogoSymbolForDarkAndLightBackgroundsPNGPage = "https://static.coinstats.app/presskit/logos/circle-logo.png";
    String pressKitLogoForLightBackgroundSVGPage = "https://static.coinstats.app/presskit/logos/logo_lightbg.svg";
    String pressKitLogoForLightBackgroundPNGPage = "https://static.coinstats.app/presskit/logos/logo_lightbg.png";
    String pressKitFirstBannerPage = "https://static.coinstats.app/presskit/banners/general_2320x720.png";
    String pressKitSecondBannerPage = "https://static.coinstats.app/presskit/banners/general_1920x720.png";
    String pressKitThirdBannerPage = "https://static.coinstats.app/presskit/banners/general_608x608.png";
    String pressKitForthBannerPage = "https://static.coinstats.app/presskit/banners/portfolio_300x250.png";
    String pressKitFifthBannerPage = "https://static.coinstats.app/presskit/banners/portfolio_415x255.png";
    String pressKitSixthBannerPage = "https://static.coinstats.app/presskit/banners/portfolio_760x94.png";
    String pressKitSeventhBannerPage = "https://static.coinstats.app/presskit/banners/appScreens_1024x512_1.png";
    String pressKitEighthBannerPage = "https://static.coinstats.app/presskit/banners/appScreens_1024x512_2.png";
    String pressKitNinthBannerPage = "https://static.coinstats.app/presskit/banners/appScreens_1024x512_3.png";

    // Widgets
    String coinPriceWidgetLargePage = "https://coinstats.app/en/widget/coin-price/?type=large";
    String coinPriceWidgetMediumPage = "https://coinstats.app/widget/coin-price/?type=medium";
    String coinPriceWidgetSmallPage = "https://coinstats.app/widget/coin-price/?type=small";
    String coinListWidgetLargePage = "https://coinstats.app/en/widget/coin-list/?type=large";
    String coinListWidgetMediumPage = "https://coinstats.app/widget/coin-list/?type=medium";
    String coinListWidgetSmallPage = "https://coinstats.app/widget/coin-list/?type=small";
    String coinPriceChartWidgetLargePage = "https://coinstats.app/en/widget/coin-price-chart/?type=large";
    String coinPriceChartWidgetMediumPage = "https://coinstats.app/widget/coin-price-chart/?type=medium";
    String insightWidgetHowManyCoinStatsUsersHoldBTCPage = "https://coinstats.app/en/widget/insight/?type=howManyUsersHold";
    String insightWidgetBTCDominanceInCoinStatsPortfoliosPage = "https://coinstats.app/widget/insight/?type=dominance";
    String insightWidgetWhereCoinStatsUsersHoldBTCPage = "https://coinstats.app/widget/insight/?type=whereUsersHold";
    String insightWidgetBTCTradesTodayPage = "https://coinstats.app/widget/insight/?type=tradesToday";
    String converterLargeWidgetPage = "https://coinstats.app/en/widget/converter/?type=large";
    String converterMediumWidgetPage = "https://coinstats.app/widget/converter/?type=medium";
    String converterSmallWidgetPage = "https://coinstats.app/widget/converter/?type=small";
    String coinCalcWidgetPage = "https://coinstats.app/en/widget/coin-calc/?type=invest";
    String coinCalcWidgetInvestedPage = "https://coinstats.app/widget/coin-calc/?type=invested";
    String coinPriceMarqueeWidget = "https://coinstats.app/en/widget/price-marquee/";

    // Portfolio
    String myPortfoliosPage = "https://coinstats.app/en/portfolio/my-portfolios";
    String portfolioHoldingsPage = "https://coinstats.app/en/portfolio/holdings/";
    String portfolioOpenPositionsPage = "https://coinstats.app/en/portfolio/open-positions/";
    String portfolioChartsPage = "https://coinstats.app/en/portfolio/charts/";
    String portfolioOrdersHistoryPage = "https://coinstats.app/en/portfolio/order-history/";
    String portfolioTradesPage = "https://coinstats.app/en/portfolio/trade-history/";
    String portfolioTransactionsPage = "https://coinstats.app/en/portfolio/transactions/";
    String portfolioOpenOrdersPage = "https://coinstats.app/en/portfolio/open-orders/";

    // Footer
    String helpCenterPage = "https://help.coinstats.app/en/";
    String featureRequestPage = "https://coin-stats.upvoty.com/members/login/?rd=7h3cChm6lY9JB2LUCr3HDhmUyxbWl2vUlW==";
    String privacyPolicyPage = "https://inomma.com/coinstatsprivacy.html";
    String termsOfUsePage = "https://coinstats.app/terms.html";
    String macOSWidgetPage = "https://apps.apple.com/us/app/coin-stats-widget/id1387758574?mt=12";
    String mozillaExtensionPage = "https://addons.mozilla.org/en-US/firefox/addon/coinstats/";
    String chromeExtensionPage = "https://chrome.google.com/webstore/detail/coinstats-crypto-portfoli/fbbckponafgkennhnmgfoikfmbkiplgp";
    String appleTVPage = "https://apps.apple.com/us/app/coin-stats-crypto-portfolio/id1247849330";

    // Help (Learn)
    String connectExchangeAccountHelpPage = "https://help.coinstats.app/en/collections/763341-connecting-exchange-accounts";
    String connectWalletAccountHelpPage = "https://help.coinstats.app/en/collections/763360-wallets";
    String tradeOnYourExchangeHelpPage = "https://help.coinstats.app/en/articles/3807847-how-to-trade-on-your-exchanges-using-coinstats-app";
    String addTransactionsHelpPage = "https://help.coinstats.app/en/articles/3592645-how-to-add-transaction-to-your-manual-portfolio";
    String PLCalculationHelpPage = "https://help.coinstats.app/en/articles/4175182-profit-loss-options-in-portfolio";

    // StayInTouch
    String telegramPage = "https://t.me/coinstatsapp";
    String facebookPage = "https://www.facebook.com/coinstats/";
    String twitterPage = "https://twitter.com/coinstats_";
    String steemitPage = "https://steemit.com/@coinstats";
    String mediumPage = "https://medium.com/coinstats";
    String mailtoPage = "mailto:support@coinstats.app";
    String instagramPage = "https://www.instagram.com/coinstats/";

    // ExploreOurProducts
    String macAppStorePage = "https://apps.apple.com/us/app/coin-stats-crypto-tracker/id1498417304?mt=12";
    String appStorePage = "https://apps.apple.com/us/app/coin-stats-btc-eth-xrp-prices-and-altfolio/id1247849330";
    String playStorePage = "https://play.google.com/store/apps/details?id=com.coinstats.crypto.portfolio";

    // LivePrices
    String marketCapPage = "https://coinstats.app/en/market-cap-charts/";
    String exchangeTabPage = "https://coinstats.app/en/exchanges/";
    String favoritesTabPage = "https://coinstats.app/en/favorites/";
    String bitcoinPage = "https://coinstats.app/en/coins/bitcoin/";
    String binancePage = "https://coinstats.app/en/exchanges/binance/";

    // Rows
    String coinsRowsPerPage20Page = "https://coinstats.app/en/?pagesize=20&page=1"; // (pages)
    String coinsRowsPerPage100Page = "https://coinstats.app/en/?pagesize=100&page=1"; // (pages)
    String coinsRowsPerPage300Page = "https://coinstats.app/en/?pagesize=300&page=1"; // (pages)
    String exchangesRowsPerPage20 = "https://coinstats.app/en/exchanges/?pagesize=20&page=1"; // (pages)
    String exchangesRowsPerPage100 = "https://coinstats.app/en/exchanges/?pagesize=100&page=1"; // (pages)

    // Any
    String coinsPage = "https://coinstats.app/en/coins/bitcoin/"; // (any coin)
    String exchangesPage = "https://coinstats.app/en/exchanges/binance/"; // (any exchange)

    // CoinsPage
    String coinOverviewPage = "https://coinstats.app/coins/bitcoin/";
    String coinNewsPage = "https://coinstats.app/coins/bitcoin/#news";
    String coinsMarketPage = "https://coinstats.app/coins/bitcoin/#markets";
    String coinsHoldingsPage = "https://coinstats.app/coins/bitcoin/#holdings";
    String coinsTeamUpdatesPage = "https://coinstats.app/coins/bitcoin/#teamupdates";
    String coinsOnChainDataPage = "https://coinstats.app/coins/bitcoin/#onchaindata";


    // --------------------------------------- Methods -----------------------------------------------

    public void navigateToCoinGecko()
    {
        driver.navigate().to(coinGecko);
    }

    public String getCookie()
    {
        return cookie;
    }

    // Header

    public void navigateToMainPage()
    {
        driver.navigate().to(mainPage);
    }

    public void navigateToPortfolioPage()
    {
        driver.navigate().to(portfolioPage);
    }

    public void navigateToNewsPage()
    {
        driver.navigate().to(newsPage);
    }

    public void navigateToPricingPage()
    {
        driver.navigate().to(pricingPage);
    }

    public void navigateTo24hReportPage()
    {
        driver.navigate().to(report24HPage);
    }

    public void navigateToPressKitPage()
    {
        driver.navigate().to(pressKitPage);
    }

    public void navigateToAPIDocsPage()
    {
        driver.navigate().to(APIDocsPage);
    }

    public void navigateToBlogPage()
    {
        driver.navigate().to(blogPage);
    }

    public void navigateToWidgetsPage()
    {
        driver.navigate().to(widgetsPage);
    }


    // Get Started

    public void navigateToGetStartedPage()
    {
        driver.navigate().to(getStartedPage);
    }

    public void navigateToSignUpWithEmailPage()
    {
        driver.navigate().to(signUpWithEmailPage);
    }

    public void navigateToLoginWithEmailPage()
    {
        driver.navigate().to(loginWithEmailPage);
    }

    public void navigateToSettingsPage()
    {
        driver.navigate().to(settingsPage);
    }

    public void navigateToForgotPasswordPage()
    {
        driver.navigate().to(forgotPasswordPage);
    }


    // Landing

    public void navigateToLandingPage()
    {
        driver.navigate().to(landingPage);
    }

    public void navigateToKevinRoseTwitterPage()
    {
        driver.navigate().to(kevinRoseTwitterPage);
    }

    public void navigateToSebastianGronewoldTwitterPage()
    {
        driver.navigate().to(sebastianGronewoldTwitterPage);
    }

    public void navigateToTyDanielSmithTwitterPage()
    {
        driver.navigate().to(tyDanielSmithTwitterPage);
    }

    public void navigateToAdelTwitterPage()
    {
        driver.navigate().to(adelTwitterPage);
    }

    public void navigateToYahooFinancePage()
    {
        driver.navigate().to(yahooFinancePage);
    }

    public void navigateToCryptoSlatePage()
    {
        driver.navigate().to(cryptoSlatePage);
    }

    public void navigateToCryptoGlobePage()
    {
        driver.navigate().to(cryptoGlobePage);
    }

    public void navigateToHackerNoonPage()
    {
        driver.navigate().to(hackerNoonPage);
    }

    public void navigateToProductHuntPage()
    {
        driver.navigate().to(productHuntPage);
    }


    // Press Kit

    public void navigateToPressKitLogoForDarkBackgroundSVGPage()
    {
        driver.navigate().to(pressKitLogoForDarkBackgroundSVGPage);
    }

    public void navigateToPressKitLogoForDarkBackgroundPNGPage()
    {
        driver.navigate().to(pressKitLogoForDarkBackgroundPNGPage);
    }

    public void navigateToPressKitLogoSymbolForDarkAndLightBackgroundsSVGPage()
    {
        driver.navigate().to(pressKitLogoSymbolForDarkAndLightBackgroundsSVGPage);
    }

    public void navigateToPressKitLogoSymbolForDarkAndLightBackgroundsPNGPage()
    {
        driver.navigate().to(pressKitLogoSymbolForDarkAndLightBackgroundsPNGPage);
    }

    public void navigateToPressKitLogoForLightBackgroundSVGPage()
    {
        driver.navigate().to(pressKitLogoForLightBackgroundSVGPage);
    }

    public void navigateToPressKitLogoForLightBackgroundPNGPage()
    {
        driver.navigate().to(pressKitLogoForLightBackgroundPNGPage);
    }

    public void navigateToPressKitFirstBannerPage()
    {
        driver.navigate().to(pressKitFirstBannerPage);
    }

    public void navigateToPressKitSecondBannerPage()
    {
        driver.navigate().to(pressKitSecondBannerPage);
    }

    public void navigateToPressKitThirdBannerPage()
    {
        driver.navigate().to(pressKitThirdBannerPage);
    }

    public void navigateToPressKitForthBannerPage()
    {
        driver.navigate().to(pressKitForthBannerPage);
    }

    public void navigateToPressKitFifthBannerPage()
    {
        driver.navigate().to(pressKitFifthBannerPage);
    }

    public void navigateToPressKitSixthBannerPage()
    {
        driver.navigate().to(pressKitSixthBannerPage);
    }

    public void navigateToPressKitSeventhBannerPage()
    {
        driver.navigate().to(pressKitSeventhBannerPage);
    }

    public void navigateToPressKitEighthBannerPage()
    {
        driver.navigate().to(pressKitEighthBannerPage);
    }

    public void navigateToPressKitNinthBannerPage()
    {
        driver.navigate().to(pressKitNinthBannerPage);
    }


    // Widgets

    public void navigateToCoinPriceWidgetLargePage()
    {
        driver.navigate().to(coinPriceWidgetLargePage);
    }

    public void navigateToCoinPriceWidgetMediumPage()
    {
        driver.navigate().to(coinPriceWidgetMediumPage);
    }

    public void navigateToCoinPriceWidgetSmallPage()
    {
        driver.navigate().to(coinPriceWidgetSmallPage);
    }

    public void navigateToCoinListWidgetLargePage()
    {
        driver.navigate().to(coinListWidgetLargePage);
    }

    public void navigateToCoinListWidgetMediumPage()
    {
        driver.navigate().to(coinListWidgetMediumPage);
    }

    public void navigateToCoinListWidgetSmallPage()
    {
        driver.navigate().to(coinListWidgetSmallPage);
    }

    public void navigateToCoinPriceChartWidgetLargePage()
    {
        driver.navigate().to(coinPriceChartWidgetLargePage);
    }

    public void navigateToCoinPriceChartWidgetMediumPage()
    {
        driver.navigate().to(coinPriceChartWidgetMediumPage);
    }

    public void navigateToInsightWidgetHowManyCoinStatsUsersHoldBTCPage()
    {
        driver.navigate().to(insightWidgetHowManyCoinStatsUsersHoldBTCPage);
    }

    public void navigateToInsightWidgetBTCDominanceInCoinStatsPortfoliosPage()
    {
        driver.navigate().to(insightWidgetBTCDominanceInCoinStatsPortfoliosPage);
    }

    public void navigateToInsightWidgetWhereCoinStatsUsersHoldBTCPage()
    {
        driver.navigate().to(insightWidgetWhereCoinStatsUsersHoldBTCPage);
    }

    public void navigateToInsightWidgetBTCTradesTodayPage()
    {
        driver.navigate().to(insightWidgetBTCTradesTodayPage);
    }

    public void navigateToConverterLargeWidgetPage()
    {
        driver.navigate().to(converterLargeWidgetPage);
    }

    public void navigateToConverterMediumWidgetPage()
    {
        driver.navigate().to(converterMediumWidgetPage);
    }

    public void navigateToConverterSmallWidgetPage()
    {
        driver.navigate().to(converterSmallWidgetPage);
    }

    public void navigateToCoinCalcWidgetPage()
    {
        driver.navigate().to(coinCalcWidgetPage);
    }

    public void navigateToCoinCalcWidgetInvestedPage()
    {
        driver.navigate().to(coinCalcWidgetInvestedPage);
    }

    public void navigateToCoinPricesMarqueeWidgetPage()
    {
        driver.navigate().to(coinPriceMarqueeWidget);
    }


    // Portfolio

    public void navigateToMyPortfoliosPage()
    {
        driver.navigate().to(myPortfoliosPage);
    }

    public void navigateToPortfolioHoldingsPage()
    {
        driver.navigate().to(portfolioHoldingsPage);
    }

    public void navigateToPortfolioOpenPositionsPage()
    {
        driver.navigate().to(portfolioOpenPositionsPage);
    }

    public void navigateToPortfolioChartsPage()
    {
        driver.navigate().to(portfolioChartsPage);
    }

    public void navigateToPortfolioOrdersHistoryPage()
    {
        driver.navigate().to(portfolioOrdersHistoryPage);
    }

    public void navigateToPortfolioTradesPage()
    {
        driver.navigate().to(portfolioTradesPage);
    }

    public void navigateToPortfolioTransactionsPage()
    {
        driver.navigate().to(portfolioTransactionsPage);
    }

    public void navigateToPortfolioOpenOrdersPage()
    {
        driver.navigate().to(portfolioOpenOrdersPage);
    }


    // Footer

    public void navigateToHelpCenterPage()
    {
        driver.navigate().to(helpCenterPage);
    }

    public void navigateToFeatureRequestPage()
    {
        driver.navigate().to(featureRequestPage);
    }

    public void navigateToPrivacyPolicyPage()
    {
        driver.navigate().to(privacyPolicyPage);
    }

    public void navigateToTermsOfUsePage()
    {
        driver.navigate().to(termsOfUsePage);
    }

    public void navigateToMacOSWidgetPage()
    {
        driver.navigate().to(macOSWidgetPage);
    }

    public void navigateTOMozillaExtensionPage()
    {
        driver.navigate().to(mozillaExtensionPage);
    }

    public void navigateToChromeExtensionPage()
    {
        driver.navigate().to(chromeExtensionPage);
    }

    public void navigateToAppleTVPage()
    {
        driver.navigate().to(appleTVPage);
    }


    // Footer Learn (Help)

    public void navigateToConnectExchangeAccountHelpPage()
    {
        driver.navigate().to(connectExchangeAccountHelpPage);
    }

    public void navigateToConnectWalletAccountHelpPage()
    {
        driver.navigate().to(connectWalletAccountHelpPage);
    }

    public void navigateToTradeOnYourExchangeHelpPage()
    {
        driver.navigate().to(tradeOnYourExchangeHelpPage);
    }

    public void navigateToAddTransactionsHelpPage()
    {
        driver.navigate().to(addTransactionsHelpPage);
    }

    public void navigateToPLCalculationHelpPage()
    {
        driver.navigate().to(PLCalculationHelpPage);
    }


    // Stay In Touch

    public void navigateToTelegramPage()
    {
        driver.navigate().to(telegramPage);
    }

    public void navigateToFacebookPage()
    {
        driver.navigate().to(facebookPage);
    }

    public void navigateToTwitterPage()
    {
        driver.navigate().to(twitterPage);
    }

    public void navigateToSteemitPage()
    {
        driver.navigate().to(steemitPage);
    }

    public void navigateToMediumPage()
    {
        driver.navigate().to(mediumPage);
    }

    public void navigateToMailtoPage()
    {
        driver.navigate().to(mailtoPage);
    }

    public void navigateToInstagramPage()
    {
        driver.navigate().to(instagramPage);
    }


    // ExploreOurProducts

    public void navigateToMacAppStorePage()
    {
        driver.navigate().to(macAppStorePage);
    }

    public void navigateToAppStorePage()
    {
        driver.navigate().to(appStorePage);
    }

    public void navigateToPlayStorePage()
    {
        driver.navigate().to(playStorePage);
    }


    // LivePrices

    public void navigateToMarketCapPage()
    {
        driver.navigate().to(marketCapPage);
    }

    public void navigateToExchangeTabPage()
    {
        driver.navigate().to(exchangeTabPage);
    }

    public void navigateToFavoritesTabPage()
    {
        driver.navigate().to(favoritesTabPage);
    }

    public void navigateToBitcoinPage()
    {
        driver.navigate().to(bitcoinPage);
    }

    public void navigateToBinancePage()
    {
        driver.navigate().to(binancePage);
    }


    // Rows

    public void navigateToCoinsRowsPerPage20Page()
    {
        driver.navigate().to(coinsRowsPerPage20Page);
    }

    public void navigateToCoinsRowsPerPage100Page()
    {
        driver.navigate().to(coinsRowsPerPage100Page);
    }

    public void navigateToCoinsRowsPerPage300Page()
    {
        driver.navigate().to(coinsRowsPerPage300Page);
    }

    public void navigateToExchangesRowsPerPage20()
    {
        driver.navigate().to(exchangesRowsPerPage20);
    }

    public void navigateToExchangesRowsPerPage100()
    {
        driver.navigate().to(exchangesRowsPerPage100);
    }


    // Any

    public void navigateToCoinsPage()
    {
        driver.navigate().to(coinsPage);
    }

    public void navigateToExchangesPage()
    {
        driver.navigate().to(exchangesPage);
    }


    // CoinsPage

    public void navigateToCoinOverviewPage()
    {
        driver.navigate().to(coinOverviewPage);
    }

    public void navigateToCoinNewsPage()
    {
        driver.navigate().to(coinNewsPage);
    }

    public void navigateToCoinsMarketPage()
    {
        driver.navigate().to(coinsMarketPage);
    }

    public void navigateToCoinsHoldingsPage()
    {
        driver.navigate().to(coinsHoldingsPage);
    }

    public void navigateToCoinsTeamUpdatesPage()
    {
        driver.navigate().to(coinsTeamUpdatesPage);
    }

    public void navigateToCoinsOnChainDataPage()
    {
        driver.navigate().to(coinsOnChainDataPage);
    }

}



