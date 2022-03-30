package com.labs1904;

import org.junit.Assert;
import org.junit.Test;

public class TestSecretRecipeDecoder {
    /*
    @Test
    public void testDecodeString() {
        Assert.assertEquals("1 cup", SecretRecipeDecoder.decodeString("8 vgl"));
    }

    @Test
    public void testDecodeIngredient() {
        Ingredient expected = new Ingredient("1 cup", "butter");
        Ingredient actual = SecretRecipeDecoder.decodeIngredient("8 vgl#hgiikf");
        Assert.assertEquals(expected.getAmount(), actual.getAmount());
        Assert.assertEquals(expected.getDescription(), actual.getDescription());
    }

     */

    @Test
    public void testNextBiggestNumber () {
        assert(SecretRecipeDecoder.getNextBiggestNumber(12) == 21);
        assert(SecretRecipeDecoder.getNextBiggestNumber(123) == 132);
        assert(SecretRecipeDecoder.getNextBiggestNumber(67809) == 67890);
    }
}
