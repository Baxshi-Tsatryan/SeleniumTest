package MainPackage;

import org.openqa.selenium.WebDriver;

public class ExchangesWalletsAPIs {

    WebDriver driver;

    public ExchangesWalletsAPIs(WebDriver driver) {
        this.driver = driver;
    }

    // Exchanges

    private String binance00APIKey = "LtcZNx1J8pXaiEqgQ8W9UHlxUBMl59QkkzwR85jbtFEhD5PXHw2A2ytukj1bryj2";
    String binance00APISecret = "uCpvTwVIQ2JpTTWPRU2smL0WH0Kx5fl4pVIVAX13RQ45hVa7Y79CKbiLBLQewtuq";

    String binance0APIKey = "LtyDiyRrkEF9hsKCI2UbtjJXJPFA0S9wPkD5m1XukCOxpDCCnRXmFMSOlpqXPfXz";
    String binance0APISecret = "dVVi5CCK0A45oQFXt5deDSys7vJJQB75wmSTFCY9qzjm6OLd49NNEztsqZrvOr69";

    String binanceNAPIKey = "BcN94QMVwlRzEaTs3xuKnk9s73cdvlDL9lTrUV0GBbD6zsOzlt0Z79HOCXIxjZvl";
    String binanceNAPISecret = "gE2SSPSMAxcnIXXXFW3bTEBi1KdveVzRxzDYVbuH6PmJbNL2Q330M62qRjRAJTFm";

    String binanceAPIKey = "IgBwMBybuvvx0aRaUr38YOQhj1kX466vaIQ0kC83bJBiIos03UFhQnUeZ0Ysi7zS";
    String binanceAPISecret = "QgDWe984yFJLDPJjSfPK2ymteGyN1etA5MTxAGhrmLDvznEyjy005miPF1Zgf6dW";

    String binanceUSAPIKey = "RVYB1wsPXYm7GS8rhDgpUnbJETPJYjeZ0VSxYaT1hYN3RvhkGzKHbpPXU8uit5iD";
    String binanceUSAPISecret = "hfPdIOun7s13eI7uP5VbRgM6JEng6gqHc42PqBDyiarOgjesUPKMcZUe6Wxs48XL";

    String bitfinexAPIKey = "BMUQ7lJPDSLm6y2kkfyGWf6IXn4j8CmL9zIeE4Nw7fA";
    String bitfinexAPISecret = "Pn40VNtUjjP9hNlFoqJTGkcnnngEb4fzsZTsh4kbRw9";

    String bitmexID = "dYOcDY6USQ4h5Nfu-eZKEssc";
    String bitmexAPISecret = "C7qmXuvzcF1ocf5-asMUInQSb_i-R0HXYV2bMLMRiUo2yZdO";

    String bitsoAPIKey = "SnutcNsIls";
    String bitsoAPISecret = "a0b6d34688235fdcbee10f55593951d2";

    String bitmaxAPIKey = "hJ6eYAcTdVGbArPcaZD8KviBqGZPwgjt";
    String bitmaxAPISecret = "PLhdfCiyxbyw4Z3rdB7USTttfnBgGgv7bNoRyKYi2Uuvqxu8S2GboaBkSAfA854o";

    String cexioAPIKey = "KRDhLP69jBzHoGU18WXTQ0MKnOg";
    String cexioAPISecret = "IpqYSm0CwqkCxTS8rzYd9z0xCo";
    String cexioUserID = "up130020592";

    String deribitClientID = "lvKWWZBb";
    String deribitClientSecret = "SffSvcmOxU6M4cyUyvZEY_iN7Suu_HIGxziAd4cIkTw";

    String idexAPICode = "e819b4b9-3e90-46d2-a25c-f5d8e8a6ace5";
    String idexAPISecret = "zi+BxZ5Jd+Nu1PhKgoHMsWGqLSGWJ9Wc";

    String hitBTCAPIKey = "p2VltjQ_pgd6Pb9N0UTA8zktrE093mMo";
    String hitBTCAPISecret = "uK2u9Y1BHxDZVabBqfHewisIzVqemNWe";

    String huobiAccessKey = "rbr45t6yr4-9140b77e-f375418a-e4abd";
    String huobiAccessSecret = "b8240a1c-987bf4c7-42af9ab0-a588e";

    String krakenAPIKey = "nM8tGHI9HAU6LZLgqhRTnm03MDbvf5nMOh9sQ6bmh/eEZKSsh/YnpHP2";
    String krakenAPISecret = "1Pw4wX+wYCMLaMLakVR7uAVvj6K/5/QzCccGXJxCYKHgM2Z7bHdgjmH4lCiE/gbbO5Q0F+/ShpUeYO7LgF8cpQ==";

    String kucoinKey = "5f3cc5b6e35cfe0006df99e5";
    String kucoinSecret = "8f342288-10fa-44d8-8d6e-9b4c8bee6674";
    String kucoinPassphrase = "coinstats";

    String liquidID = "1595065";
    String liquidTokenSecret = "spsdD33HWsQLmZxBfXVFPwrfByYjLcbIuDZYlUlWDN1QHEANsjyalSUqzHIKTQKtUAZo651iVGzw1uMxdhIJsQ==";

    String okexKey = "0c9892e8-3b1c-4f40-aa37-fc0d8a9bbd0e";
    String okexSecret = "29088D8B8BABCFC860FCCE1272D04619";
    String okexPassphrase = "coinstats";

    String poloniexAPIKey = "C6OM7H3S-O4OMXJW6-NAEREN4X-F4LNVDKY";
    String poloniexAPISecret = "bc37997363241fd58e48bb825994ed7acd7f9bf9df33a6f0ee090717df155e4a8903079742eb656f65b7ac3375905ec3e4449cd2a71b01e899106973cae7d9c0";

    String byBitAPIPrivateKey = "uv2pewcQCKoTTD5LSD";
    String byBitPrivateKey = "R7qU11quoXqWNr75Z7HZBmr4T1KzU42QKzwi";

    String ftxAPIKey = "nq4ELeSnFpCCNj9ea8uUtxTYmhKKOFYRs0iA9hgp";
    String ftxAPISecret = "okRhmYg6UeNmXIHekdGlKVMxZkY_gxAmteweXlvq";




    // Wallets

    String ethereumWallet = "0xC20a1CB4389903b97ab42b911aAb420BBec6eC1c";
    String ethereumClassicWallet = "0x871bEC6F199395D99424B8a554Fd6FAD6Fb32e3d";
    String bitcoinWallet = "bc1qhm9dyt5gdlyrd0kd99gxj9g2p37msr8zxqyqpf";
    String bitcoinCashWallet = "qrknzg6l9cwsyzcf7wqfshssaqtn8qcpfgn7dkxw67";
    String XRPWallet = "rDszsE4tWgCfx8yzkZEx7aYeVRiHF23yg3";
    String litecoinWallet = "ltc1qz5rgrxvyhdjyqree86na3qaane76agcsur7037";
    String neoWallet = "AcuCi6tppw7eWdXovtiv6JSMT2bnmK1xwQ";
    String dashWallet = "XqYs6Z3zifERiU1FBNnfnTTAhjEVgp1iED";
    String cardanoWallet = "TN8EoftcTEW7VjDiaLhYCNRGswwRkjSh7S";
    String veChainWallet = "0xF1Ca85Ada7BfC2fF13995164Fd20d3C2C6f026d2";
    String tronWallet = "TN8EoftcTEW7VjDiaLhYCNRGswwRkjSh7S";
    String EOSWallet = "bnb1zgez9tj4fd2834pntff0shdfw43udh58wezwxt";
    String wavesWallet = "3P9ici3ievSXxt59yxaCWcmQhbss8AQ11mL";
    String tezosWallet = "tz1QMt7a1p5DXB1tNirFFFfqY4o76HtfxtAf";
    String stellarWallet = "GBR27DA6RV47ORID6PE2CCGSUO4S6UKZVO553VKYJ2PNI6TEWFSMWUDL";
    String algorandWallet = "2WZSPRDAWR2BMLW2C4RKTN5IU3WG72SVPW2QA746GP63RPCV2GZVVEKYNM";
    String cosmosWallet = "cosmos15v50ymp6n5dn73erkqtmq0u8adpl8d3ujv2e74";
    String digiByteWallet = "DN4yzowAzPbtM6Hh4HsNjFH8QjurZ4Nzhz";
    String ontologyWallet = "AL1mbmtWq3pqiYv2pZ13bsJHU5oGrFcvoY";
    String zClassicWallet = "t1dH2GMdJu6E7xFW2Doi7Xo8WeGBa5BSkJ4";
    String zillqaWallet = "0x05f4a42e251f2d52b8ed15e9fedaacfcef1fad27";


    // Multi-Coins Wallets

    //Exodus

    String bitcoinExodus = "bc1qlddz8kgx2320wpvj9sj8y54hg6em3h0xkqvwa7";
    String ethereumExodus = "0x2Aa0D4cA03CAbbA7746a8c90085B2d8d2f2d2cA7";
    String XRPExodus = "rBHbiAVKmTBwnybB1VKvhVBV2wN8e3CWMt";
    String litecoinExodus = "0x2Aa0D4cA03CAbbA7746a8c90085B2d8d2f2d2cA7";
    String NEOExodus = "AcuCi6tppw7eWdXovtiv6JSMT2bnmK1xwQ";
    String dashExodus = "XdQLw5FkpMaVVVFHncfQVswvwtv53YB97e";
    String cardanoExodus = "Ae2tdPwUPEZBmTGWUR7LNBxY8eJVAeSmovNL32HM5iqsCWv2TJJtobci3Rd";
    String ethereumClassicExodus = "0xDc5a875E8321D3d951bcEf91ca798c124c7bcE23";
    String veChainExodus = "0x687912d858Fb7B44Ccec48ac0564F5aE77fDCE04";
    String tronExodus = "TW9FXZg8ATCfqiQvrvgR3UANBjLijrhz42";
    String tetherExodus = "0x2Aa0D4cA03CAbbA7746a8c90085B2d8d2f2d2cA7";
    String binanceChainExodus = "bnb1zqd5l3hvtwkmd2l3aptvwwehzk825unvn4w9sc";

    // Ledger

    String ethereumLedger = "0xf56799d7C95C6DEb708A9f55b2e75A685A94F980";
    String bitcoinLedger = "19VVSmRswV8sXYcQzueWvnxtUhwBrmbv9j";

    // Trezor

    String trezorXPub = "dgub8s5XZpUn5RXyAZTWdh9wbM5DXctrfML4NYW3SgNHofvCQYJwLK8Qe3dU1NMgfw4qsnvfx8hF3FSnnZzNGHpFEQwkx85SoqRE1ZWLcDss7BH";
    String bitcoinTrezor = "37PRXdNotxYepC52huwxZXD5Ywer2VmT49";
    String dashTrezor = "XjshemZswzcjEMpjPP2qvuCPtAzBXuh4Zs";
    String litecoinTrezor = "M8fK7sxLCuukHeY8oN5A8gFnfQHHHQB2PH";


    // ------------------------------------------ Getters -----------------------------------------------

    // Binance 00

    public String getBinance00APIKey()
    {
        return binance00APIKey;
    }

    public String getBinance00APISecret()
    {
        return binance00APISecret;
    }


    // Binance 0

    public String getBinance0APIKey()
    {
        return binance0APIKey;
    }

    public String getBinance0APISecret()
    {
        return binance0APISecret;
    }


    // Binance N

    public String getBinanceNAPIKey()
    {
        return binanceNAPIKey;
    }

    public String getBinanceNAPISecret()
    {
        return binanceNAPISecret;
    }


    // Binance

    public String getBinanceAPIKey()
    {
        return binanceAPIKey;
    }

    public String getBinanceAPISecret()
    {
        return binanceAPISecret;
    }


    // Binance US

    public String getBinanceUSAPIKey()
    {
        return binanceUSAPIKey;
    }

    public String getBinanceUSAPISecret()
    {
        return binanceUSAPISecret;
    }


    // Bitfinex

    public String getBitfinexAPIKey()
    {
        return bitfinexAPIKey;
    }

    public String getBitfinexAPISecret()
    {
        return bitfinexAPISecret;
    }


    // Bitmex

    public String getBitmexID()
    {
        return bitmexID;
    }

    public String getBitmexAPISecret()
    {
        return bitmexAPISecret;
    }


    // Bitso

    public String getBitsoAPIKey()
    {
        return bitsoAPIKey;
    }

    public String getBitsoAPISecret()
    {
        return bitsoAPISecret;
    }


    // Bitmax

    public String getBitmaxAPIKey()
    {
        return bitmaxAPIKey;
    }

    public String getBitmaxAPISecret()
    {
        return bitmaxAPISecret;
    }


    // Cex io

    public String getCexioAPIKey()
    {
        return cexioAPIKey;
    }

    public String getCexioAPISecret()
    {
        return cexioAPISecret;
    }

    public String getCexioUserID()
    {
        return cexioUserID;
    }


    // Deribit

    public String getDeribitClientID()
    {
        return deribitClientID;
    }

    public String getDeribitClientSecret()
    {
        return deribitClientSecret;
    }


    // IDEX

    public String getIdexAPICode()
    {
        return idexAPICode;
    }

    public String getIdexAPISecret()
    {
        return idexAPISecret;
    }


    // HitBTC

    public String getHitBTCAPIKey()
    {
        return hitBTCAPIKey;
    }

    public String getHitBTCAPISecret()
    {
        return hitBTCAPISecret;
    }


    // Huobi

    public String getHuobiAccessKey()
    {
        return huobiAccessKey;
    }

    public String getHuobiAccessSecret()
    {
        return huobiAccessSecret;
    }


    // Kraken

    public String getKrakenAPIKey()
    {
        return krakenAPIKey;
    }

    public String getKrakenAPISecret()
    {
        return krakenAPISecret;
    }


    // Kucoin

    public String getKucoinKey()
    {
        return kucoinKey;
    }

    public String getKucoinSecret()
    {
        return kucoinSecret;
    }

    public String getKucoinPassphrase()
    {
        return kucoinPassphrase;
    }


    // Liquid

    public String getLiquidID()
    {
        return liquidID;
    }

    public String getLiquidTokenSecret()
    {
        return liquidTokenSecret;
    }


    // OKEX

    public String getOkexKey()
    {
        return okexKey;
    }

    public String getOkexSecret()
    {
        return okexSecret;
    }

    public String getOkexPassphrase()
    {
        return okexPassphrase;
    }


    // Poloniex

    public String getPoloniexAPIKey()
    {
        return poloniexAPIKey;
    }

    public String getPoloniexAPISecret()
    {
        return poloniexAPISecret;
    }


    // ByBit

    public String getByBitAPIPrivateKey()
    {
        return byBitAPIPrivateKey;
    }

    public String getByBitPrivateKey()
    {
        return byBitPrivateKey;
    }


    // FTX

    public String getFTXAPIKey()
    {
        return ftxAPIKey;
    }

    public String getFTXAPISecret()
    {
        return ftxAPISecret;
    }


    // Wallets

    public String getEthereumWallet()
    {
        return ethereumWallet;
    }

    public String getEthereumClassicWallet()
    {
        return ethereumClassicWallet;
    }

    public String getBitcoinWallet()
    {
        return bitcoinWallet;
    }

    public String getBitcoinCashWallet()
    {
        return bitcoinCashWallet;
    }

    public String getXRPWallet()
    {
        return XRPWallet;
    }

    public String getLitecoinWallet()
    {
        return litecoinWallet;
    }

    public String getNeoWallet()
    {
        return neoWallet;
    }

    public String getDashWallet()
    {
        return dashWallet;
    }

    public String getCardanoWallet()
    {
        return cardanoWallet;
    }

    public String getVeChainWallet()
    {
        return veChainWallet;
    }

    public String getTronWallet()
    {
        return tronWallet;
    }

    public String getEOSWallet()
    {
        return EOSWallet;
    }

    public String getWavesWallet()
    {
        return wavesWallet;
    }

    public String getTezosWallet()
    {
        return tezosWallet;
    }

    public String getStellarWallet()
    {
        return stellarWallet;
    }

    public String getAlgorandWallet()
    {
        return algorandWallet;
    }

    public String getCosmosWallet()
    {
        return cosmosWallet;
    }

    public String getDigiByteWallet()
    {
        return digiByteWallet;
    }

    public String getOntologyWallet()
    {
        return ontologyWallet;
    }

    public String getZClassicWallet()
    {
        return zClassicWallet;
    }

    public String getZillqaWallet()
    {
        return zillqaWallet;
    }



    // Multi-Coins Wallets

    // Exodus

    public String getBitcoinExodus()
    {
        return bitcoinExodus;
    }

    public String getEthereumExodus()
    {
        return ethereumExodus;
    }

    public String getXRPExodus()
    {
        return XRPExodus;
    }

    public String getLitecoinExodus()
    {
        return litecoinExodus;
    }

    public String getNEOExodus()
    {
        return NEOExodus;
    }

    public String getDashExodus()
    {
        return dashExodus;
    }

    public String getCardanoExodus()
    {
        return cardanoExodus;
    }

    public String getEthereumClassicExodus()
    {
        return ethereumClassicExodus;
    }

    public String getVeChainExodus()
    {
        return ethereumClassicExodus;
    }

    public String getTronExodus()
    {
        return tronExodus;
    }

    public String getTetherExodus()
    {
        return tetherExodus;
    }

    public String getBinanceChainExodus()
    {
        return binanceChainExodus;
    }


    // Ledger

    public String getEthereumLedger()
    {
        return ethereumLedger;
    }

    public String getBitcoinLedger()
    {
        return bitcoinLedger;
    }


    // Trezor

    public String getTrezorXPub()
    {
        return trezorXPub;
    }

    public String getBitcoinTrezor()
    {
        return bitcoinTrezor;
    }

    public String getDashTrezor()
    {
        return dashTrezor;
    }

    public String getLitecoinTrezor()
    {
        return litecoinTrezor;
    }

}
