package de.michm.cli;

/**
 * Main class for Java Repository Template.
 */
public class Main {

    public static final String JAVA_CLI_STARTER = "java-cli-starter";

    public static void main(String[] args) {
        try {
            App app = new App(JAVA_CLI_STARTER);
            app.run();
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
    }
}
