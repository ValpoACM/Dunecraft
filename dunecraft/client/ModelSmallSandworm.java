// Date: 4/16/2013 8:47:53 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package mods.tutorial.generic.client;

import net.minecraft.client.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.Entity;

public class ModelSmallSandworm extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer Body1;
    ModelRenderer Body2;
    ModelRenderer Body3;
    ModelRenderer Body4;
    ModelRenderer Body5;
    ModelRenderer Body6;
    ModelRenderer Body7;
    ModelRenderer Body8;
    ModelRenderer Tail;
  
  public ModelSmallSandworm()
  {
    textureWidth = 256;
    textureHeight = 256;
    
      Head = new ModelRenderer(this, 65, 0);
      Head.addBox(-16F, -8F, -8F, 16, 16, 16);
      Head.setRotationPoint(88F, 16F, 0F);
      Head.setTextureSize(256, 256);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Body1 = new ModelRenderer(this, 0, 0);
      Body1.addBox(-16F, -8F, -8F, 16, 16, 16);
      Body1.setRotationPoint(72F, 16F, 0F);
      Body1.setTextureSize(256, 256);
      Body1.mirror = true;
      setRotation(Body1, 0F, 0F, 0F);
      Body2 = new ModelRenderer(this, 0, 0);
      Body2.addBox(-16F, -8F, -8F, 16, 16, 16);
      Body2.setRotationPoint(56F, 16F, 0F);
      Body2.setTextureSize(256, 256);
      Body2.mirror = true;
      setRotation(Body2, 0F, 0F, 0F);
      Body3 = new ModelRenderer(this, 0, 0);
      Body3.addBox(-16F, -8F, -8F, 16, 16, 16);
      Body3.setRotationPoint(40F, 16F, 0F);
      Body3.setTextureSize(256, 256);
      Body3.mirror = true;
      setRotation(Body3, 0F, 0F, 0F);
      Body4 = new ModelRenderer(this, 0, 0);
      Body4.addBox(-16F, -8F, -8F, 16, 16, 16);
      Body4.setRotationPoint(24F, 16F, 0F);
      Body4.setTextureSize(256, 256);
      Body4.mirror = true;
      setRotation(Body4, 0F, 0F, 0F);
      Body5 = new ModelRenderer(this, 0, 0);
      Body5.addBox(-16F, -8F, -8F, 16, 16, 16);
      Body5.setRotationPoint(8F, 16F, 0F);
      Body5.setTextureSize(256, 256);
      Body5.mirror = true;
      setRotation(Body5, 0F, 0F, 0F);
      Body6 = new ModelRenderer(this, 0, 0);
      Body6.addBox(-16F, -8F, -8F, 16, 16, 16);
      Body6.setRotationPoint(-8F, 16F, 0F);
      Body6.setTextureSize(256, 256);
      Body6.mirror = true;
      setRotation(Body6, 0F, 0F, 0F);
      Body7 = new ModelRenderer(this, 0, 0);
      Body7.addBox(-16F, -8F, -8F, 16, 16, 16);
      Body7.setRotationPoint(-24F, 16F, 0F);
      Body7.setTextureSize(256, 256);
      Body7.mirror = true;
      setRotation(Body7, 0F, 0F, 0F);
      Body8 = new ModelRenderer(this, 0, 0);
      Body8.addBox(-16F, -8F, -8F, 16, 16, 16);
      Body8.setRotationPoint(-40F, 16F, 0F);
      Body8.setTextureSize(256, 256);
      Body8.mirror = true;
      setRotation(Body8, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 0, 33);
      Tail.addBox(-16F, -8F, -8F, 16, 16, 16);
      Tail.setRotationPoint(-56F, 16F, 0F);
      Tail.setTextureSize(256, 256);
      Tail.mirror = true;
      setRotation(Tail, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Head.render(f5);
    Body1.render(f5);
    Body2.render(f5);
    Body3.render(f5);
    Body4.render(f5);
    Body5.render(f5);
    Body6.render(f5);
    Body7.render(f5);
    Body8.render(f5);
    Tail.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}