package io.jmix.sampler.screen.ui.components.browserframe.url;

import io.jmix.ui.component.BrowserFrame;
import io.jmix.ui.component.UrlResource;
import io.jmix.ui.screen.ScreenFragment;
import io.jmix.ui.screen.Subscribe;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.MalformedURLException;
import java.net.URL;

@UiController("browserframe-url")
@UiDescriptor("browserframe-url.xml")
public class BrowserFrameUrlSample extends ScreenFragment {

    private static final Logger log = LoggerFactory.getLogger(BrowserFrameUrlSample.class);

    @Autowired
    protected BrowserFrame programmaticBrowserFrame;

    @Subscribe
    protected void onInit(InitEvent event) {
        try {
            URL url = new URL("https://docs.jmix.io/jmix/intro.html");
            programmaticBrowserFrame.setSource(UrlResource.class)
                    .setUrl(url);
        } catch (MalformedURLException e) {
            log.debug(e.getMessage());
        }
    }
}
