package io.jmix.sampler.screen.ui.components.combobox.simple;

import io.jmix.core.Metadata;
import io.jmix.sampler.entity.Customer;
import io.jmix.ui.model.InstanceContainer;
import io.jmix.ui.screen.ScreenFragment;
import io.jmix.ui.screen.Subscribe;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("combobox-simple")
@UiDescriptor("combobox-simple.xml")
public class ComboBoxSimpleSample extends ScreenFragment {

    @Autowired
    protected InstanceContainer<Customer> customerDc;
    @Autowired
    protected Metadata metadata;

    @Subscribe
    protected void onInit(InitEvent event) {
        // InstanceContainer initialization. It is usually done automatically if the screen is
        // inherited from StandardEditor and is used as an entity editor.
        Customer customer = metadata.create(Customer.class);
        customerDc.setItem(customer);
    }
}
