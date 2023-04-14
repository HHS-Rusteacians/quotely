package org.hhsrustaceans.quotely.quote.component;

import lombok.Getter;
import org.hhsrustaceans.quotely.quote.options.Option;

/**
 * A component that represents an option. It contains the option itself and the price of the option.
 * The name of the component is the name of the option.
 * @author HHS Rustaceans
 * @since 1.0
 */
public class OptionComponent extends Component {
    public OptionComponent(Option option) {
        super(option.getName(), option.getPrice());
        this.option = option;
    }

    @Getter
    private Option option;
}
