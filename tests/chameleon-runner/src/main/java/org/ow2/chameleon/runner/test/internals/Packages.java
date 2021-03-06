package org.ow2.chameleon.runner.test.internals;

/**
 * Sets of methods appending packages to export to the given list.
 */
public class Packages {

    public static void junit(StringBuilder builder) {
        checkEmpty(builder);
        // org.junit
        builder.append("org.junit, " +
                "org.junit.runners, " +
                "org.junit.runners.model," +
                "org.junit.runner," +
                "org.junit.runner.manipulation," +
                "org.junit.runner.notification," +
                "org.junit.matchers," +
                "org.junit.rules,");

        // junit.framework
        builder.append("junit.framework");
    }

    public static void wisdomtest(StringBuilder builder) {
        checkEmpty(builder);
        builder.append("org.ow2.chameleon.runner.test,");
        builder.append("org.ow2.chameleon.runner.test.utils,");
        builder.append("org.ow2.chameleon.runner.test.shared");
    }

    public static void javaxinject(StringBuilder builder) {
        checkEmpty(builder);
        builder.append("javax.inject;version=1.0.0");
    }

    public static void assertj(StringBuilder builder) {
        checkEmpty(builder);
        builder.append("org.assertj.core.api," +
                "org.assertj.core.api.filter, " +
                "org.assertj.core.condition");
    }

    public static void osgihelpers(StringBuilder builder) {
        checkEmpty(builder);
        builder.append("org.ow2.chameleon.testing.helpers, " +
                "org.ow2.chameleon.testing.helpers.constants," +
                "org.apache.felix.ipojo.test.helpers");
    }

    private static void checkEmpty(StringBuilder builder) {
        if (builder.length() != 0) {
            builder.append(",");
        }
    }

}
