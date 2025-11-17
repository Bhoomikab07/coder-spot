package com.xworkz.exceptionexamples.external;

import com.xworkz.exceptionexamples.internal.ProblemInvalid;

public class ProblemInvalidRunner {
    public static void main(String[] args) {
        ProblemInvalid problemInvalid = new ProblemInvalid();
        problemInvalid.issue(10);
    }
}
