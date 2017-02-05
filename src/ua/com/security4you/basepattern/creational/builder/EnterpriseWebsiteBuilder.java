package ua.com.security4you.basepattern.creational.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Enterprise website");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIPRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
