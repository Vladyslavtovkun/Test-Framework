package app.core.invokers.impl;

import app.core.invokers.WebDriverInvoker;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URI;

public class RemoteChromeInvoker implements WebDriverInvoker {

    @SneakyThrows
    public WebDriver invokeWebDriver() {
        return new RemoteWebDriver(
                URI.create("http://localhost:4444/wd/hub").toURL(),
                desiredCapabilitiesCreator()
        );
    }

    public DesiredCapabilities desiredCapabilitiesCreator() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("79.0");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        capabilities.setCapability("videoName", "Test.mp4");
        return capabilities;
    }
}
