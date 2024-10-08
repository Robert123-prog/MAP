public class Markus {

    public int cheapestKeyboard(int[] keyboardPrices) {
        int minPrice = Integer.MAX_VALUE;

        for (int keyboardPrice : keyboardPrices) {
            if (keyboardPrice < minPrice) {
                minPrice = keyboardPrice;
            }
        }
        return minPrice;
    }

    public int mostExpensiveItems(int[] keyboardPrices, int[] usbPrices) {
        int maxPrice = Integer.MIN_VALUE;

        for (int keyboardPrice : keyboardPrices) {
            if (keyboardPrice > maxPrice) {
                maxPrice = keyboardPrice;
            }
        }

        for (int usbPrice : usbPrices) {
            if (usbPrice > maxPrice) {
                maxPrice = usbPrice;
            }
        }

        return maxPrice;
    }

    public int mostExpensiveUsbInBudget(int budget, int[] usbPrices) {
        int minDifference = Integer.MAX_VALUE;
        int usbInBudget = 0;

        for (int usbPrice : usbPrices) {
            if (Math.abs(budget - usbPrice) < minDifference) {
                minDifference = budget - usbPrice;
                usbInBudget = usbPrice;
            }
        }
        return usbInBudget;
    }

    //helper method
    public int mostExpensiveKeyboardInBudget(int budget, int[] keyboardPrices) {
        if (budget < this.cheapestKeyboard(keyboardPrices)) {
            return -1;
        }

        int minDifference = Integer.MAX_VALUE;
        int keyboardInBudget = 0;

        for (int keyboardPrice : keyboardPrices) {
            if (Math.abs(budget - keyboardPrice) < minDifference) {
                minDifference = budget - keyboardPrice;
                keyboardInBudget = keyboardPrice;
            }
        }
        return keyboardInBudget;
    }

    public int cheapestUsb(int[] usbPrices) {
        int minPrice = Integer.MAX_VALUE;

        for (int usbPrice : usbPrices) {
            if (usbPrice < minPrice) {
                minPrice = usbPrice;
            }
        }
        return minPrice;
    }

    public int bestCombinationInBudget(int budget, int[] keyboardPrices, int[] usbPrices) {
        if (budget < this.cheapestUsb(usbPrices) || budget < this.cheapestKeyboard(keyboardPrices)) {
            return -1;
        }

        if ((keyboardPrices.length == 1 && keyboardPrices[0] >= budget) || (usbPrices.length == 1 && usbPrices[0] >= budget)){
            return -1;
        }

        int maxMoneySpent = 0;

        for (int keyboardPrice : keyboardPrices) {
            for (int usbPrice : usbPrices) {
                int cost = keyboardPrice + usbPrice;

                if (cost <= budget && cost > maxMoneySpent) {
                    maxMoneySpent = cost;
                }
            }
        }
        return maxMoneySpent;
    }
}
