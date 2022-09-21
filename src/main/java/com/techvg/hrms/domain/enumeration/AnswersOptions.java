package com.techvg.hrms.domain.enumeration;

/**
 * The AnswersOptions enumeration.
 */
public enum AnswersOptions {
    YES("Yes"),
    NO("No");

    private final String value;

    AnswersOptions(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
