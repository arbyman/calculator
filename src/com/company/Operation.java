package com.company;

public enum Operation {
    SUM {
        public int calc(int a, int b) {
            return a + b;
        }
    },
    SUBTRACT {
        public int calc(int a, int b) {
            return a - b;
        }
    },
    MULTIPLY {
        public int calc(int a, int b) {
            return a * b;
        }
    },
    DIVIDE {
        public int calc(int a, int b) {
            return a / b;
        }
    };
    public abstract int calc(int a, int b);
}
