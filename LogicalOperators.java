 class LogicalOperator {
    public static void main(String[] args) {
        // AND(&) OPERATOR , OR(|) OPERATOR, NOR(!) OPERATOR
        int a = 56;
        int b = 67;
        int x = 90;
        int y = 87;
        boolean result = a<b && x>y;
        boolean result1 = a<b || x<y;
        boolean result2 = a>b;
        System.out.println(result1);
        System.out.println(result);
        System.out.println(!result2);

        }
    }
