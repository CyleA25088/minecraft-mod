package com.example;

import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;

public class ModBlockItemIds {
    public static final BlockItemId RUBY_BLOCK = create("ruby_block");

    private static BlockItemId create(String name) {
        Identifier id = TemplateMod.id(name);
        return BlockItemId.create(id, id);
    }
}