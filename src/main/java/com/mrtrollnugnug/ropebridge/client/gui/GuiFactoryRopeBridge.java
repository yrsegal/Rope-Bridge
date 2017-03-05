package com.mrtrollnugnug.ropebridge.client.gui;

import java.util.Set;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;

public class GuiFactoryRopeBridge implements IModGuiFactory {

    // This was scheduled for removal in 1.11
    @Override
    public RuntimeOptionGuiHandler getHandlerFor (RuntimeOptionCategoryElement element) {
        return null;
    }

    @Override
    public void initialize (Minecraft minecraftInstance) {
    	//Initializes the GUI when Config Button is pressed
    }

    @Override
    public Class<? extends GuiScreen> mainConfigGuiClass () {
        return GuiConfigRopeBridge.class;
    }

    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories () {
        return null;
    }
}