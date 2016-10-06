package io.bootique.example.kafka.consumer;

import com.google.inject.Binder;
import com.google.inject.Module;
import io.bootique.BQCoreModule;
import io.bootique.Bootique;

/**
 * Main app class.
 */
public class App implements Module {

    // TODO: add support for --verbose option once https://github.com/bootique/bootique/issues/101 becomes available.

    public static void main(String[] args) {
        Bootique.app("--config=classpath:defaults.yml").args(args).autoLoadModules().module(App.class).run();
    }

    @Override
    public void configure(Binder binder) {
        BQCoreModule.setDefaultCommand(binder, KafkaConsumerCommand.class);
    }


}
