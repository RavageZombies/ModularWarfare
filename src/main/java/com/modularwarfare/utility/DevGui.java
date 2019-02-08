package com.modularwarfare.utility;

import org.lwjgl.opengl.GL11;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.model.ModelGun;
import com.modularwarfare.common.guns.GunType;
import com.modularwarfare.common.guns.ItemAmmo;
import com.modularwarfare.common.guns.ItemGun;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import scala.actors.threadpool.Arrays;

public class DevGui extends Gui
{

	//private final ResourceLocation gunStats = new ResourceLocation(ModularWarfare.MOD_ID, "skins/" + "gunstats.png");
	//private final int boxWidth = 100, boxHeight = 200;

	
	public DevGui(Minecraft mc, ItemStack itemStack, ItemGun itemGun)
	{
    	GunType gunType = ((ItemGun) itemStack.getItem()).type;

    	if(gunType == null)
    		return;
    	
        ScaledResolution scaled = new ScaledResolution(mc);
        //TODO Add GUI scale command
        float textScale = 0.75f;
        int width = (int) ((scaled.getScaledWidth() / 50) * textScale);
        int height = (int) ((scaled.getScaledHeight() / 50) * textScale);
        
    	if(mc.player.inventory.armorItemInSlot(3) != null && mc.player.inventory.armorItemInSlot(3).getItem() == Items.GOLDEN_HELMET)
    	{

        	boolean hasAmmo = ItemGun.hasAmmoLoaded(itemStack);

    		//Visual variables
    		String displayName = "Display Name- " + gunType.displayName;
    		String internalName = "Internal Name - " + gunType.internalName;
    		String modelName = "Model Name - " + gunType.modelName;
    		String modelScale =  "Model Scale - " + Float.toString(gunType.model.modelScale);
    		String iconName = "Icon Name - " + gunType.iconName;
    		String skinNames = "Skin Name(s) - " + Arrays.toString(gunType.modelSkins).replace("[","").replace("]","");
    		String dynamicAmmo = "Dynamic Ammo Model - " + Boolean.toString(gunType.dynamicAmmo);
    		String reloadAnim = "Reload Anim - " + ((ModelGun)gunType.model).reloadAnimation;
    		
    
            //mc.renderEngine.bindTexture(gunStats);
            //drawTexturedModalRect(380, 0, 0, 0, boxWidth, boxHeight);
            
            GL11.glPushMatrix();
            {
            	GL11.glScalef(textScale, textScale, textScale);
            	//VISUAL GUN PROPERTIES
            	mc.fontRenderer.drawString("Gun Visuals;", (width), (height) + 88, Integer.parseInt("FF0000", 16), false);
            	mc.fontRenderer.drawString(internalName, (width), (height) + 96, Integer.parseInt("FFFFFF", 16), false);
                mc.fontRenderer.drawString(displayName, (width), (height) + 104, Integer.parseInt("FFFFFF", 16), false);
        		mc.fontRenderer.drawString(modelName, (width), (height) + 112, Integer.parseInt("FFFFFF", 16), false);
        		mc.fontRenderer.drawString(modelScale, (width), (height) + 120, Integer.parseInt("FFFFFF", 16), false);
        		mc.fontRenderer.drawString(iconName, (width), (height) + 128, Integer.parseInt("FFFFFF", 16), false);
        		mc.fontRenderer.drawString(skinNames, (width), (height) + 136, Integer.parseInt("FFFFFF", 16), false);
        		mc.fontRenderer.drawString(dynamicAmmo, (width), (height) + 144, Integer.parseInt("FFFFFF", 16), false);
        		mc.fontRenderer.drawString(reloadAnim, (width), (height) + 152, Integer.parseInt("FFFFFF", 16), false);
            }
            GL11.glPopMatrix();

        	if(hasAmmo) 
        	{
        		ItemStack ammoStack = new ItemStack(itemStack.getTagCompound().getCompoundTag("ammo"));
        		ItemAmmo itemAmmo = (ItemAmmo) ammoStack.getItem();
        	}
    		
    	}
    	
    	if(mc.player.inventory.armorItemInSlot(2) != null && mc.player.inventory.armorItemInSlot(2).getItem() == Items.GOLDEN_CHESTPLATE)
    	{
    		//Gun stats
    		String gunDamage = "Damage/RPM - " + Float.toString(gunType.gunDamage) + "/" + Float.toString(gunType.roundsPerMin);
    		String reloadTime = "Reload Time - " + Float.toString(gunType.reloadTime) + "ticks";
    		String ammoTypes = "Ammos - " + Arrays.toString(gunType.acceptedAmmo).replace("[","").replace("]","");
    		String fireModes = "Fire Modes - " + Arrays.toString(gunType.fireModes).replace("[","").replace("]","");
    		String gunRange = "Range Effective/Max - " + Float.toString(gunType.weaponEffectiveRange) + "/" + Float.toString(gunType.weaponMaxRange);
    		String sprintFire = "Sprint Fire - " + Boolean.toString(gunType.allowSprintFiring);
    		String recoilPitch = "Recoil Pitch - " + Float.toString(gunType.recoilPitch) + " +/- " + Float.toString(gunType.randomRecoilPitch);
    		String recoilYaw = "Recoil Yaw - " + Float.toString(gunType.recoilYaw) + " +/- " + Float.toString(gunType.randomRecoilYaw);
    		String modelRecoil = "Model Recoil Pitch/Back/Shake - " + Float.toString(((ModelGun)gunType.model).modelRecoilUpwards) + "/" + Float.toString(((ModelGun)gunType.model).modelRecoilBackwards) + "/" + Float.toString(((ModelGun)gunType.model).modelRecoilShake);    		
    		GL11.glPushMatrix();
    		{
        		GL11.glScalef(textScale, textScale, textScale);
        		//GUN STATS
        		mc.fontRenderer.drawString("Gun Stats;", (width), (height), Integer.parseInt("FF0000", 16), false);
        		mc.fontRenderer.drawString(gunDamage, (width), (height) + 8, Integer.parseInt("FFFFFF", 16), false);
        		mc.fontRenderer.drawString(reloadTime, (width), (height) + 16, Integer.parseInt("FFFFFF", 16), false);
        		mc.fontRenderer.drawString(fireModes, (width), (height) + 24, Integer.parseInt("FFFFFF", 16), false);
        		mc.fontRenderer.drawString(gunRange, (width), (height) + 32, Integer.parseInt("FFFFFF", 16), false);
        		mc.fontRenderer.drawString(sprintFire, (width), (height) + 40, Integer.parseInt("FFFFFF", 16), false);
        		mc.fontRenderer.drawString(recoilPitch, (width), (height) + 48, Integer.parseInt("FFFFFF", 16), false);
        		mc.fontRenderer.drawString(recoilYaw, (width), (height) + 56, Integer.parseInt("FFFFFF", 16), false);
        		mc.fontRenderer.drawString(modelRecoil, (width), (height) + 64, Integer.parseInt("FFFFFF", 16), false);
        		mc.fontRenderer.drawString(ammoTypes, (width), (height) + 72, Integer.parseInt("FFFFFF", 16), false);
    		}
    		GL11.glPopMatrix();
    		
    	}
    	
	
	}

}

