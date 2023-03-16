package org.hhsrustaceans.quotely.quote.component;

import lombok.Getter;
import org.hhsrustaceans.quotely.quote.Option;

public class OptionComponent extends Component {
    public OptionComponent(Option option) {
        super(option.getName(), option.getPrice());
        this.option = option;
    }

    @Getter
    private Option option;
}
