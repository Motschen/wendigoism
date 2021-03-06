package moriyashiine.wendigoism.client.model.entity.living;

import moriyashiine.wendigoism.common.entity.WendigoEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class WendigoEntityModel<T extends Entity> extends EntityModel<T> {
	private final ModelPart chest;
	private final ModelPart lArm00;
	private final ModelPart rArm00;
	private final ModelPart lLeg00;
	private final ModelPart rLeg00;
	
	public WendigoEntityModel() {
		textureWidth = 128;
		textureHeight = 64;
		ModelPart lowerJaw = new ModelPart(this, 26, 47);
		lowerJaw.setPivot(0, -0.3F, -3.6F);
		lowerJaw.addCuboid(-1.5F, -0.5F, -3.1F, 3, 1, 4, 0);
		setRotationAngle(lowerJaw, 0.10471975511965977F, 0, 0);
		ModelPart upperJaw01 = new ModelPart(this, 41, 41);
		upperJaw01.setPivot(0, 0, 0);
		upperJaw01.addCuboid(-1.8F, -1, -3.1F, 1, 2, 3, 0);
		ModelPart lClaw03 = new ModelPart(this, 27, 0);
		lClaw03.setPivot(1, 10, 0.8F);
		lClaw03.addCuboid(-1.4F, -0.8F, -0.5F, 2, 5, 1, 0);
		setRotationAngle(lClaw03, 0.10471975511965977F, 0, 0.22689280275926282F);
		chest = new ModelPart(this, 0, 0);
		chest.setPivot(0, -8.5F, -0.8F);
		chest.addCuboid(-4, -4.5F, -3.4F, 8, 9, 7, 0);
		setRotationAngle(chest, 0.2792526803190927F, 0, 0);
		ModelPart lRib00C = new ModelPart(this, 53, 0);
		lRib00C.setPivot(0.1F, 0, 2.8F);
		lRib00C.addCuboid(0, -0.5F, 0, 1, 1, 3, 0);
		setRotationAngle(lRib00C, 0, -0.4363323129985824F, 0);
		ModelPart upperJaw00 = new ModelPart(this, 50, 42);
		upperJaw00.setPivot(0, -1.1F, -3.8F);
		upperJaw00.addCuboid(-1.2F, -1, -3.1F, 3, 2, 3, 0);
		ModelPart rRib02B = new ModelPart(this, 53, 0);
		rRib02B.mirror = true;
		rRib02B.setPivot(-3.8F, 0, 0);
		rRib02B.addCuboid(0, -0.5F, -0.7F, 1, 1, 4, 0);
		ModelPart lRib05B = new ModelPart(this, 53, 0);
		lRib05B.setPivot(3.8F, 0, 0);
		lRib05B.addCuboid(0, -0.5F, -0.7F, 1, 1, 4, 0);
		ModelPart lAntler06A = new ModelPart(this, 53, 0);
		lAntler06A.setPivot(0.2F, 1.3F, 0);
		lAntler06A.addCuboid(-0.5F, -2, -0.5F, 1, 2, 1, 0);
		setRotationAngle(lAntler06A, 0.9599310885968813F, 0, 0.3141592653589793F);
		ModelPart lRib03B = new ModelPart(this, 53, 0);
		lRib03B.setPivot(2.8F, 0, 0);
		lRib03B.addCuboid(0, -0.5F, -0.7F, 1, 1, 4, 0);
		ModelPart rAntler01 = new ModelPart(this, 53, 0);
		rAntler01.mirror = true;
		rAntler01.setPivot(0, -2.3F, 0);
		rAntler01.addCuboid(-0.5F, -3, -0.5F, 1, 3, 1, 0);
		setRotationAngle(rAntler01, -0.3141592653589793F, 0, -0.2792526803190927F);
		ModelPart rLeg02 = new ModelPart(this, 66, 30);
		rLeg02.mirror = true;
		rLeg02.setPivot(0, 5.8F, 0.6F);
		rLeg02.addCuboid(-1, 0, -1.5F, 2, 9, 3, 0);
		setRotationAngle(rLeg02, -0.6806784082777886F, 0, 0);
		ModelPart lRib02C = new ModelPart(this, 53, 0);
		lRib02C.setPivot(0.1F, 0, 2.8F);
		lRib02C.addCuboid(0, -0.5F, 0, 1, 1, 3, 0);
		setRotationAngle(lRib02C, 0, -0.4363323129985824F, 0);
		ModelPart sternum00 = new ModelPart(this, 53, 0);
		sternum00.setPivot(0, -0.8F, -3.5F);
		sternum00.addCuboid(-1, -2, -1, 2, 5, 1, 0);
		setRotationAngle(sternum00, -0.05235987755982988F, 0, 0);
		ModelPart lRib04C = new ModelPart(this, 53, 0);
		lRib04C.setPivot(0.1F, 0, 2.8F);
		lRib04C.addCuboid(0, -0.5F, 0, 1, 1, 3, 0);
		setRotationAngle(lRib04C, 0, -0.4363323129985824F, 0);
		ModelPart mane00 = new ModelPart(this, 0, 48);
		mane00.setPivot(0, -2.9F, 2);
		mane00.addCuboid(-2, -1, -0.5F, 4, 2, 4, 0);
		setRotationAngle(mane00, -0.6981317007977318F, 0, 0);
		ModelPart lRib00A = new ModelPart(this, 53, 0);
		lRib00A.setPivot(0.7F, -1.5F, 0);
		lRib00A.addCuboid(0, -0.5F, -0.8F, 3, 1, 1, 0);
		setRotationAngle(lRib00A, 0, 0.20943951023931953F, -0.3839724354387525F);
		ModelPart rRib04B = new ModelPart(this, 53, 0);
		rRib04B.mirror = true;
		rRib04B.setPivot(-3.8F, 0, 0);
		rRib04B.addCuboid(0, -0.5F, -0.7F, 1, 1, 4, 0);
		ModelPart rEar = new ModelPart(this, 52, 35);
		rEar.mirror = true;
		rEar.setPivot(-2, -2.9F, 0.6F);
		rEar.addCuboid(-3, -1, -0.5F, 3, 2, 1, 0);
		setRotationAngle(rEar, 0.2617993877991494F, 0.17453292519943295F, 0.4363323129985824F);
		ModelPart lRib05A = new ModelPart(this, 53, 0);
		lRib05A.setPivot(0.4F, 2.7F, 0);
		lRib05A.addCuboid(0, -0.5F, -0.8F, 4, 1, 1, 0);
		setRotationAngle(lRib05A, 0, 0.20943951023931953F, 0.6981317007977318F);
		ModelPart rAntler05A = new ModelPart(this, 53, 0);
		rAntler05A.mirror = true;
		rAntler05A.setPivot(0, -2.3F, -0.2F);
		rAntler05A.addCuboid(-0.5F, -1.9F, -0.5F, 1, 2, 1, 0);
		setRotationAngle(rAntler05A, -0.08726646259971647F, 0, 0.8726646259971648F);
		ModelPart rArm01 = new ModelPart(this, 103, 25);
		rArm01.mirror = true;
		rArm01.setPivot(-1.4F, 10.4F, 0.2F);
		rArm01.addCuboid(-1.5F, 0, -1.5F, 3, 11, 3, 0);
		setRotationAngle(rArm01, -0.3490658503988659F, 0, -0.13962634015954636F);
		ModelPart rClaw01 = new ModelPart(this, 27, 0);
		rClaw01.mirror = true;
		rClaw01.setPivot(-1, 10, 0);
		rClaw01.addCuboid(-0.6F, -0.8F, -1.6F, 2, 5, 1, 0);
		setRotationAngle(rClaw01, -0.10471975511965977F, 0, -0.22689280275926282F);
		ModelPart lAntler03A = new ModelPart(this, 53, 0);
		lAntler03A.setPivot(0.3F, 0.3F, -0.3F);
		lAntler03A.addCuboid(-0.5F, -5.5F, -0.5F, 1, 6, 1, 0);
		setRotationAngle(lAntler03A, 0.2792526803190927F, 0, 0.5235987755982988F);
		ModelPart lAntler03B = new ModelPart(this, 53, 0);
		lAntler03B.setPivot(0, -5.3F, 0);
		lAntler03B.addCuboid(-0.5F, -3, -0.5F, 1, 3, 1, 0);
		setRotationAngle(lAntler03B, 0.10471975511965977F, 0, -0.5235987755982988F);
		lArm00 = new ModelPart(this, 104, 9);
		lArm00.setPivot(3.4F, -3.5F, 0.4F);
		lArm00.addCuboid(0, 0.2F, -1.5F, 3, 11, 3, 0);
		setRotationAngle(lArm00, -0.20943951023931953F, 0, -0.17453292519943295F);
		ModelPart rRib04C = new ModelPart(this, 53, 0);
		rRib04C.mirror = true;
		rRib04C.setPivot(-0.1F, 0, 2.8F);
		rRib04C.addCuboid(0, -0.5F, 0, 1, 1, 3, 0);
		setRotationAngle(rRib04C, 0, 0.4363323129985824F, 0);
		ModelPart guts = new ModelPart(this, 34, 0);
		guts.setPivot(0, 5.7F, -1.6F);
		guts.addCuboid(-3, -3.4F, -2, 6, 7, 2, 0);
		ModelPart rRib00A = new ModelPart(this, 53, 0);
		rRib00A.mirror = true;
		rRib00A.setPivot(-0.7F, -1.5F, 0);
		rRib00A.addCuboid(-3, -0.5F, -0.8F, 3, 1, 1, 0);
		setRotationAngle(rRib00A, 0, -0.20943951023931953F, 0.3839724354387525F);
		ModelPart lAntler00 = new ModelPart(this, 53, 0);
		lAntler00.setPivot(1.3F, -3.3F, -1.3F);
		lAntler00.addCuboid(-1, -2.6F, -1, 2, 3, 2, 0);
		setRotationAngle(lAntler00, -0.5235987755982988F, 0, 0.17453292519943295F);
		ModelPart lRib01A = new ModelPart(this, 53, 0);
		lRib01A.setPivot(0.7F, -0.4F, 0);
		lRib01A.addCuboid(0, -0.5F, -0.8F, 3, 1, 1, 0);
		setRotationAngle(lRib01A, 0, 0.20943951023931953F, -0.2792526803190927F);
		ModelPart lRib03A = new ModelPart(this, 53, 0);
		lRib03A.setPivot(0.7F, 1.8F, 0);
		lRib03A.addCuboid(0, -0.5F, -0.8F, 3, 1, 1, 0);
		setRotationAngle(lRib03A, 0, 0.20943951023931953F, -0.05235987755982988F);
		ModelPart lRib01C = new ModelPart(this, 53, 0);
		lRib01C.setPivot(0.1F, 0, 2.8F);
		lRib01C.addCuboid(0, -0.5F, 0, 1, 1, 3, 0);
		setRotationAngle(lRib01C, 0, -0.4363323129985824F, 0);
		ModelPart mane02 = new ModelPart(this, 26, 53);
		mane02.setPivot(0, -1.2F, 1.8F);
		mane02.addCuboid(-3.5F, -1, -0.5F, 7, 2, 8, 0);
		setRotationAngle(mane02, -0.9599310885968813F, 0, 0);
		ModelPart rAntler04A = new ModelPart(this, 53, 0);
		rAntler04A.mirror = true;
		rAntler04A.setPivot(-0.8F, 2.6F, -0.6F);
		rAntler04A.addCuboid(-0.5F, -2.6F, -0.5F, 1, 3, 1, 0);
		setRotationAngle(rAntler04A, 0.593411945678072F, 0, -0.5235987755982988F);
		ModelPart lEar = new ModelPart(this, 52, 35);
		lEar.setPivot(2, -2.9F, 0.6F);
		lEar.addCuboid(0, -1, -0.5F, 3, 2, 1, 0);
		setRotationAngle(lEar, 0.2617993877991494F, -0.17453292519943295F, -0.4363323129985824F);
		ModelPart lRib05C = new ModelPart(this, 53, 0);
		lRib05C.setPivot(0.1F, 0, 2.8F);
		lRib05C.addCuboid(0, -0.5F, 0, 1, 1, 4, 0);
		setRotationAngle(lRib05C, 0, -0.5759586531581287F, 0);
		ModelPart rRib00C = new ModelPart(this, 53, 0);
		rRib00C.mirror = true;
		rRib00C.setPivot(-0.1F, 0, 2.8F);
		rRib00C.addCuboid(0, -0.5F, 0, 1, 1, 3, 0);
		setRotationAngle(rRib00C, 0, 0.4363323129985824F, 0);
		ModelPart mane01 = new ModelPart(this, 0, 55);
		mane01.setPivot(0, -1.2F, 1.8F);
		mane01.addCuboid(-3, -1, -0.5F, 6, 2, 6, 0);
		setRotationAngle(mane01, -0.6981317007977318F, 0, 0);
		ModelPart rAntler04B = new ModelPart(this, 53, 0);
		rAntler04B.mirror = true;
		rAntler04B.setPivot(0, -2.4F, 0);
		rAntler04B.addCuboid(-0.5F, -2, -0.5F, 1, 2, 1, 0);
		setRotationAngle(rAntler04B, 0.10471975511965977F, 0, 0.5235987755982988F);
		ModelPart rAntler00 = new ModelPart(this, 53, 0);
		rAntler00.mirror = true;
		rAntler00.setPivot(-1.3F, -3.3F, -1.3F);
		rAntler00.addCuboid(-1, -2.6F, -1, 2, 3, 2, 0);
		setRotationAngle(rAntler00, -0.5235987755982988F, 0, -0.17453292519943295F);
		ModelPart lShouldeFur = new ModelPart(this, 103, 0);
		lShouldeFur.setPivot(0, -0.4F, 0.2F);
		lShouldeFur.addCuboid(-0.1F, -1, -2, 5, 3, 4, 0);
		setRotationAngle(lShouldeFur, 0, 0, 0.5235987755982988F);
		ModelPart rHoof = new ModelPart(this, 66, 44);
		rHoof.mirror = true;
		rHoof.setPivot(0, 7.9F, -0.4F);
		rHoof.addCuboid(-1.5F, 0, -2.1F, 3, 2, 4, 0);
		setRotationAngle(rHoof, 0.17453292519943295F, 0, 0);
		ModelPart lLeg01 = new ModelPart(this, 66, 17);
		lLeg01.setPivot(1.5F, 8.3F, -0.7F);
		lLeg01.addCuboid(-1.5F, 0, -2, 3, 7, 4, 0);
		setRotationAngle(lLeg01, 0.9075712110370513F, 0, 0);
		ModelPart rRib03A = new ModelPart(this, 53, 0);
		rRib03A.mirror = true;
		rRib03A.setPivot(-0.7F, 1.8F, 0);
		rRib03A.addCuboid(-3, -0.5F, -0.8F, 3, 1, 1, 0);
		setRotationAngle(rRib03A, 0, -0.20943951023931953F, 0.05235987755982988F);
		ModelPart lRib00B = new ModelPart(this, 53, 0);
		lRib00B.setPivot(2.8F, 0, 0);
		lRib00B.addCuboid(0, -0.5F, -0.7F, 1, 1, 4, 0);
		ModelPart rAntler06A = new ModelPart(this, 53, 0);
		rAntler06A.mirror = true;
		rAntler06A.setPivot(-0.2F, 1.3F, 0);
		rAntler06A.addCuboid(-0.5F, -2, -0.5F, 1, 2, 1, 0);
		setRotationAngle(rAntler06A, 0.9599310885968813F, 0, -0.3141592653589793F);
		ModelPart rLeg01 = new ModelPart(this, 66, 17);
		rLeg01.mirror = true;
		rLeg01.setPivot(-1.5F, 8.3F, -0.7F);
		rLeg01.addCuboid(-1.5F, 0, -2, 3, 7, 4, 0);
		setRotationAngle(rLeg01, 0.9075712110370513F, 0, 0);
		ModelPart rRib05C = new ModelPart(this, 53, 0);
		rRib05C.mirror = true;
		rRib05C.setPivot(-0.1F, 0, 2.8F);
		rRib05C.addCuboid(0, -0.5F, 0, 1, 1, 4, 0);
		setRotationAngle(rRib05C, 0, 0.5759586531581287F, 0);
		ModelPart lowerBody = new ModelPart(this, 0, 16);
		lowerBody.setPivot(0, 4, 0.4F);
		lowerBody.addCuboid(-3.5F, 0, -2, 7, 10, 5, 0);
		setRotationAngle(lowerBody, -0.17453292519943295F, 0, 0);
		ModelPart rClaw02 = new ModelPart(this, 27, 0);
		rClaw02.mirror = true;
		rClaw02.setPivot(-1, 10, -0.1F);
		rClaw02.addCuboid(-0.6F, -0.8F, -0.5F, 2, 5, 1, 0);
		setRotationAngle(rClaw02, 0, 0, -0.22689280275926282F);
		ModelPart lClaw01 = new ModelPart(this, 27, 0);
		lClaw01.setPivot(1, 10, 0);
		lClaw01.addCuboid(-1.4F, -0.8F, -1.6F, 2, 5, 1, 0);
		setRotationAngle(lClaw01, -0.10471975511965977F, 0, 0.22689280275926282F);
		ModelPart rRib04A = new ModelPart(this, 53, 0);
		rRib04A.mirror = true;
		rRib04A.setPivot(-0.7F, 2.5F, 0);
		rRib04A.addCuboid(-3, -0.5F, -0.8F, 3, 1, 1, 0);
		setRotationAngle(rRib04A, 0, -0.20943951023931953F, -0.24434609527920614F);
		ModelPart rAntler02B = new ModelPart(this, 53, 0);
		rAntler02B.mirror = true;
		rAntler02B.setPivot(0, -3.8F, 0);
		rAntler02B.addCuboid(-0.5F, -3.8F, -0.5F, 1, 4, 1, 0);
		setRotationAngle(rAntler02B, 0.10471975511965977F, 0, 0.2792526803190927F);
		ModelPart snout = new ModelPart(this, 26, 40);
		snout.setPivot(0, -2.7F, -4.1F);
		snout.addCuboid(-1.5F, -0.8F, -3.1F, 3, 2, 4, 0);
		setRotationAngle(snout, 0.2792526803190927F, 0, 0);
		ModelPart mane03 = new ModelPart(this, 58, 53);
		mane03.setPivot(0, -1.6F, -2.2F);
		mane03.addCuboid(-2.5F, 0, -1, 5, 5, 2, 0);
		setRotationAngle(mane03, -0.5235987755982988F, 0, 0);
		ModelPart lAntler04A = new ModelPart(this, 53, 0);
		lAntler04A.setPivot(0.8F, 2.6F, -0.6F);
		lAntler04A.addCuboid(-0.5F, -2.6F, -0.5F, 1, 3, 1, 0);
		setRotationAngle(lAntler04A, 0.593411945678072F, 0, 0.5235987755982988F);
		ModelPart rRib01A = new ModelPart(this, 53, 0);
		rRib01A.mirror = true;
		rRib01A.setPivot(-0.7F, -0.4F, 0);
		rRib01A.addCuboid(-3, -0.5F, -0.8F, 3, 1, 1, 0);
		setRotationAngle(rRib01A, 0, -0.20943951023931953F, 0.2792526803190927F);
		rLeg00 = new ModelPart(this, 66, 0);
		rLeg00.mirror = true;
		rLeg00.setPivot(-1.2F, 7, 0.2F);
		rLeg00.addCuboid(-3.5F, -1, -2.5F, 4, 11, 5, 0);
		setRotationAngle(rLeg00, -0.4886921905584123F, 0.13962634015954636F, 0);
		ModelPart rAntler03B = new ModelPart(this, 53, 0);
		rAntler03B.mirror = true;
		rAntler03B.setPivot(0, -5.3F, 0);
		rAntler03B.addCuboid(-0.5F, -3, -0.5F, 1, 3, 1, 0);
		setRotationAngle(rAntler03B, 0.10471975511965977F, 0, 0.5235987755982988F);
		ModelPart lRib03C = new ModelPart(this, 53, 0);
		lRib03C.setPivot(0.1F, 0, 2.8F);
		lRib03C.addCuboid(0, -0.5F, 0, 1, 1, 3, 0);
		setRotationAngle(lRib03C, 0, -0.4363323129985824F, 0);
		ModelPart rRib03B = new ModelPart(this, 53, 0);
		rRib03B.mirror = true;
		rRib03B.setPivot(-3.8F, 0, 0);
		rRib03B.addCuboid(0, -0.5F, -0.7F, 1, 1, 4, 0);
		ModelPart lAntler06B = new ModelPart(this, 53, 0);
		lAntler06B.setPivot(0.1F, -1.7F, 0);
		lAntler06B.addCuboid(-0.5F, -2, -0.5F, 1, 2, 1, 0);
		setRotationAngle(lAntler06B, 0.10471975511965977F, 0, -0.5235987755982988F);
		ModelPart rRib02C = new ModelPart(this, 53, 0);
		rRib02C.mirror = true;
		rRib02C.setPivot(-0.1F, 0, 2.8F);
		rRib02C.addCuboid(0, -0.5F, 0, 1, 1, 3, 0);
		setRotationAngle(rRib02C, 0, 0.4363323129985824F, 0);
		ModelPart neck01 = new ModelPart(this, 0, 40);
		neck01.setPivot(0, -1.7F, 0);
		neck01.addCuboid(-2, -3, -2.5F, 4, 2, 5, 0);
		setRotationAngle(neck01, -0.03490658503988659F, 0, 0);
		ModelPart rShouldeFur = new ModelPart(this, 103, 0);
		rShouldeFur.mirror = true;
		rShouldeFur.setPivot(0, -0.4F, 0.2F);
		rShouldeFur.addCuboid(-4.9F, -1, -2, 5, 3, 4, 0);
		setRotationAngle(rShouldeFur, 0, 0, -0.5235987755982988F);
		rArm00 = new ModelPart(this, 88, 0);
		rArm00.mirror = true;
		rArm00.setPivot(-3.4F, -3.5F, 0.4F);
		rArm00.addCuboid(-3, 0.2F, -1.5F, 3, 11, 3, 0);
		setRotationAngle(rArm00, -0.20943951023931953F, 0, 0.17453292519943295F);
		ModelPart lRib02A = new ModelPart(this, 53, 0);
		lRib02A.setPivot(0.7F, 0.7F, 0);
		lRib02A.addCuboid(0, -0.5F, -0.8F, 3, 1, 1, 0);
		setRotationAngle(lRib02A, 0, 0.20943951023931953F, -0.15707963267948966F);
		ModelPart neck00 = new ModelPart(this, 0, 31);
		neck00.setPivot(0, -4.4F, 0);
		neck00.addCuboid(-2.5F, -3, -3, 5, 3, 6, 0);
		setRotationAngle(neck00, -0.03490658503988659F, 0, 0);
		ModelPart lClaw02 = new ModelPart(this, 27, 0);
		lClaw02.setPivot(1, 10, -0.1F);
		lClaw02.addCuboid(-1.4F, -0.8F, -0.5F, 2, 5, 1, 0);
		setRotationAngle(lClaw02, 0, 0, 0.22689280275926282F);
		ModelPart lAntler04B = new ModelPart(this, 53, 0);
		lAntler04B.setPivot(0, -2.4F, 0);
		lAntler04B.addCuboid(-0.5F, -2, -0.5F, 1, 2, 1, 0);
		setRotationAngle(lAntler04B, 0.10471975511965977F, 0, -0.5235987755982988F);
		ModelPart lAntler01 = new ModelPart(this, 53, 0);
		lAntler01.setPivot(0, -2.3F, 0);
		lAntler01.addCuboid(-0.5F, -3, -0.5F, 1, 3, 1, 0);
		setRotationAngle(lAntler01, -0.3141592653589793F, 0, 0.2792526803190927F);
		ModelPart rAntler06B = new ModelPart(this, 53, 0);
		rAntler06B.mirror = true;
		rAntler06B.setPivot(-0.1F, -1.7F, 0);
		rAntler06B.addCuboid(-0.5F, -2, -0.5F, 1, 2, 1, 0);
		setRotationAngle(rAntler06B, 0.10471975511965977F, 0, 0.5235987755982988F);
		ModelPart lHoof = new ModelPart(this, 66, 44);
		lHoof.setPivot(0, 7.9F, -0.4F);
		lHoof.addCuboid(-1.5F, 0, -2.1F, 3, 2, 4, 0);
		setRotationAngle(lHoof, 0.17453292519943295F, 0, 0);
		ModelPart rRib05B = new ModelPart(this, 53, 0);
		rRib05B.mirror = true;
		rRib05B.setPivot(-4.8F, 0, 0);
		rRib05B.addCuboid(0, -0.5F, -0.7F, 1, 1, 4, 0);
		ModelPart rAntler02A = new ModelPart(this, 53, 0);
		rAntler02A.mirror = true;
		rAntler02A.setPivot(0, -2.8F, 0);
		rAntler02A.addCuboid(-0.5F, -4, -0.5F, 1, 4, 1, 0);
		setRotationAngle(rAntler02A, 0.10471975511965977F, 0, -0.03490658503988659F);
		ModelPart mane04 = new ModelPart(this, 73, 53);
		mane04.setPivot(0, -2.9F, -1.7F);
		mane04.addCuboid(-2, 0, -1, 4, 4, 2, 0);
		setRotationAngle(mane04, -0.6981317007977318F, 0, 0);
		lLeg00 = new ModelPart(this, 46, 8);
		lLeg00.setPivot(1.2F, 7, 0.2F);
		lLeg00.addCuboid(-0.5F, -1, -2.5F, 4, 11, 5, 0);
		setRotationAngle(lLeg00, -0.4886921905584123F, -0.13962634015954636F, 0);
		ModelPart head = new ModelPart(this, 26, 28);
		head.setPivot(0, -3, 0.6F);
		head.addCuboid(-2.5F, -3.9F, -3.9F, 5, 4, 6, 0);
		ModelPart lRib04A = new ModelPart(this, 53, 0);
		lRib04A.setPivot(0.7F, 2.5F, 0);
		lRib04A.addCuboid(0, -0.5F, -0.8F, 3, 1, 1, 0);
		setRotationAngle(lRib04A, 0, 0.20943951023931953F, 0.24434609527920614F);
		ModelPart lAntler05A = new ModelPart(this, 53, 0);
		lAntler05A.setPivot(0, -2.3F, -0.2F);
		lAntler05A.addCuboid(-0.5F, -1.9F, -0.5F, 1, 2, 1, 0);
		setRotationAngle(lAntler05A, -0.08726646259971647F, 0, -0.8726646259971648F);
		ModelPart lAntler05B = new ModelPart(this, 53, 0);
		lAntler05B.setPivot(0, -1.8F, 0);
		lAntler05B.addCuboid(-0.5F, -1, -0.5F, 1, 1, 1, 0);
		setRotationAngle(lAntler05B, 0.10471975511965977F, 0, 0.2617993877991494F);
		ModelPart lAntler02A = new ModelPart(this, 53, 0);
		lAntler02A.setPivot(0, -2.8F, 0);
		lAntler02A.addCuboid(-0.5F, -4, -0.5F, 1, 4, 1, 0);
		setRotationAngle(lAntler02A, 0.10471975511965977F, 0, 0.03490658503988659F);
		ModelPart rAntler05B = new ModelPart(this, 53, 0);
		rAntler05B.mirror = true;
		rAntler05B.setPivot(0, -1.8F, 0);
		rAntler05B.addCuboid(-0.5F, -1, -0.5F, 1, 1, 1, 0);
		setRotationAngle(rAntler05B, 0.10471975511965977F, 0, -0.2617993877991494F);
		ModelPart sternum01 = new ModelPart(this, 53, 0);
		sternum01.setPivot(0, 2.6F, -0.3F);
		sternum01.addCuboid(-0.5F, 0, -0.6F, 1, 2, 1, 0);
		ModelPart lRib01B = new ModelPart(this, 53, 0);
		lRib01B.setPivot(2.8F, 0, 0);
		lRib01B.addCuboid(0, -0.5F, -0.7F, 1, 1, 4, 0);
		ModelPart rRib01C = new ModelPart(this, 53, 0);
		rRib01C.mirror = true;
		rRib01C.setPivot(-0.1F, 0, 2.8F);
		rRib01C.addCuboid(0, -0.5F, 0, 1, 1, 3, 0);
		setRotationAngle(rRib01C, 0, 0.4363323129985824F, 0);
		ModelPart rRib00B = new ModelPart(this, 53, 0);
		rRib00B.mirror = true;
		rRib00B.setPivot(-3.8F, 0, 0);
		rRib00B.addCuboid(0, -0.5F, -0.7F, 1, 1, 4, 0);
		ModelPart lRib04B = new ModelPart(this, 53, 0);
		lRib04B.setPivot(2.8F, 0, 0);
		lRib04B.addCuboid(0, -0.5F, -0.7F, 1, 1, 4, 0);
		ModelPart rClaw03 = new ModelPart(this, 27, 0);
		rClaw03.mirror = true;
		rClaw03.setPivot(-1, 10, 0.8F);
		rClaw03.addCuboid(-0.6F, -0.8F, -0.5F, 2, 5, 1, 0);
		setRotationAngle(rClaw03, 0.10471975511965977F, 0, -0.22689280275926282F);
		ModelPart lAntler02B = new ModelPart(this, 53, 0);
		lAntler02B.setPivot(0, -3.8F, 0);
		lAntler02B.addCuboid(-0.5F, -3.8F, -0.5F, 1, 4, 1, 0);
		setRotationAngle(lAntler02B, 0.10471975511965977F, 0, -0.2792526803190927F);
		ModelPart lLeg02 = new ModelPart(this, 66, 30);
		lLeg02.setPivot(0, 5.8F, 0.6F);
		lLeg02.addCuboid(-1, 0, -1.5F, 2, 9, 3, 0);
		setRotationAngle(lLeg02, -0.6806784082777886F, 0, 0);
		ModelPart lRib02B = new ModelPart(this, 53, 0);
		lRib02B.setPivot(2.8F, 0, 0);
		lRib02B.addCuboid(0, -0.5F, -0.7F, 1, 1, 4, 0);
		ModelPart rRib03C = new ModelPart(this, 53, 0);
		rRib03C.mirror = true;
		rRib03C.setPivot(-0.1F, 0, 2.8F);
		rRib03C.addCuboid(0, -0.5F, 0, 1, 1, 3, 0);
		setRotationAngle(rRib03C, 0, 0.4363323129985824F, 0);
		ModelPart lArm01 = new ModelPart(this, 88, 16);
		lArm01.setPivot(1.4F, 10.4F, 0.2F);
		lArm01.addCuboid(-1.5F, 0, -1.5F, 3, 11, 3, 0);
		setRotationAngle(lArm01, -0.3490658503988659F, 0, 0.13962634015954636F);
		ModelPart rAntler03A = new ModelPart(this, 53, 0);
		rAntler03A.mirror = true;
		rAntler03A.setPivot(-0.3F, 0.3F, -0.3F);
		rAntler03A.addCuboid(-0.5F, -5.5F, -0.5F, 1, 6, 1, 0);
		setRotationAngle(rAntler03A, 0.2792526803190927F, 0, -0.5235987755982988F);
		ModelPart rRib05A = new ModelPart(this, 53, 0);
		rRib05A.mirror = true;
		rRib05A.setPivot(-0.4F, 2.7F, 0);
		rRib05A.addCuboid(-4, -0.5F, -0.8F, 4, 1, 1, 0);
		setRotationAngle(rRib05A, 0, -0.20943951023931953F, -0.6981317007977318F);
		ModelPart rRib02A = new ModelPart(this, 53, 0);
		rRib02A.mirror = true;
		rRib02A.setPivot(-0.7F, 0.7F, 0);
		rRib02A.addCuboid(-3, -0.5F, -0.8F, 3, 1, 1, 0);
		setRotationAngle(rRib02A, 0, -0.20943951023931953F, 0.15707963267948966F);
		ModelPart rRib01B = new ModelPart(this, 53, 0);
		rRib01B.mirror = true;
		rRib01B.setPivot(-3.8F, 0, 0);
		rRib01B.addCuboid(0, -0.5F, -0.7F, 1, 1, 4, 0);
		head.addChild(lowerJaw);
		upperJaw00.addChild(upperJaw01);
		lArm01.addChild(lClaw03);
		lRib00B.addChild(lRib00C);
		head.addChild(upperJaw00);
		rRib02A.addChild(rRib02B);
		lRib05A.addChild(lRib05B);
		lAntler01.addChild(lAntler06A);
		lRib03A.addChild(lRib03B);
		rAntler00.addChild(rAntler01);
		rLeg01.addChild(rLeg02);
		lRib02B.addChild(lRib02C);
		chest.addChild(sternum00);
		lRib04B.addChild(lRib04C);
		neck01.addChild(mane00);
		sternum00.addChild(lRib00A);
		rRib04A.addChild(rRib04B);
		head.addChild(rEar);
		sternum00.addChild(lRib05A);
		rAntler01.addChild(rAntler05A);
		rArm00.addChild(rArm01);
		rArm01.addChild(rClaw01);
		lAntler02A.addChild(lAntler03A);
		lAntler03A.addChild(lAntler03B);
		chest.addChild(lArm00);
		rRib04B.addChild(rRib04C);
		lowerBody.addChild(guts);
		sternum00.addChild(rRib00A);
		head.addChild(lAntler00);
		sternum00.addChild(lRib01A);
		sternum00.addChild(lRib03A);
		lRib01B.addChild(lRib01C);
		neck00.addChild(mane02);
		rAntler02A.addChild(rAntler04A);
		head.addChild(lEar);
		lRib05B.addChild(lRib05C);
		rRib00B.addChild(rRib00C);
		neck01.addChild(mane01);
		rAntler04A.addChild(rAntler04B);
		head.addChild(rAntler00);
		lArm00.addChild(lShouldeFur);
		rLeg02.addChild(rHoof);
		lLeg00.addChild(lLeg01);
		sternum00.addChild(rRib03A);
		lRib00A.addChild(lRib00B);
		rAntler01.addChild(rAntler06A);
		rLeg00.addChild(rLeg01);
		rRib05B.addChild(rRib05C);
		chest.addChild(lowerBody);
		rArm01.addChild(rClaw02);
		lArm01.addChild(lClaw01);
		sternum00.addChild(rRib04A);
		rAntler02A.addChild(rAntler02B);
		head.addChild(snout);
		neck00.addChild(mane03);
		lAntler02A.addChild(lAntler04A);
		sternum00.addChild(rRib01A);
		lowerBody.addChild(rLeg00);
		rAntler03A.addChild(rAntler03B);
		lRib03B.addChild(lRib03C);
		rRib03A.addChild(rRib03B);
		lAntler06A.addChild(lAntler06B);
		rRib02B.addChild(rRib02C);
		neck00.addChild(neck01);
		rArm00.addChild(rShouldeFur);
		chest.addChild(rArm00);
		sternum00.addChild(lRib02A);
		chest.addChild(neck00);
		lArm01.addChild(lClaw02);
		lAntler04A.addChild(lAntler04B);
		lAntler00.addChild(lAntler01);
		rAntler06A.addChild(rAntler06B);
		lLeg02.addChild(lHoof);
		rRib05A.addChild(rRib05B);
		rAntler01.addChild(rAntler02A);
		neck00.addChild(mane04);
		lowerBody.addChild(lLeg00);
		neck01.addChild(head);
		sternum00.addChild(lRib04A);
		lAntler01.addChild(lAntler05A);
		lAntler05A.addChild(lAntler05B);
		lAntler01.addChild(lAntler02A);
		rAntler05A.addChild(rAntler05B);
		sternum00.addChild(sternum01);
		lRib01A.addChild(lRib01B);
		rRib01B.addChild(rRib01C);
		rRib00A.addChild(rRib00B);
		lRib04A.addChild(lRib04B);
		rArm01.addChild(rClaw03);
		lAntler02A.addChild(lAntler02B);
		lLeg01.addChild(lLeg02);
		lRib02A.addChild(lRib02B);
		rRib03B.addChild(rRib03C);
		lArm00.addChild(lArm01);
		rAntler02A.addChild(rAntler03A);
		sternum00.addChild(rRib05A);
		sternum00.addChild(rRib02A);
		rRib01A.addChild(rRib01B);
	}
	
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
		chest.render(matrices, vertices, light, overlay, red, green, blue, alpha);
	}
	
	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		float right = MathHelper.cos(limbAngle * 0.6662f + (float) Math.PI) * limbDistance * 0.5f;
		float left = MathHelper.cos(limbAngle * 0.6662f) * limbDistance * 0.5f;
		if (entity.getDataTracker().get(WendigoEntity.ATTACKING)) {
			right -= 1;
			left -= 1;
		}
		rArm00.pitch = right;
		lArm00.pitch = left;
		rLeg00.pitch = (MathHelper.cos(limbAngle * 0.6662f) * limbDistance) - 0.5f;
		lLeg00.pitch = (MathHelper.cos(limbAngle * 0.6662f + (float) Math.PI) * limbDistance) - 0.5f;
	}
	
	private void setRotationAngle(ModelPart modelPart, float x, float y, float z) {
		modelPart.pitch = x;
		modelPart.yaw = y;
		modelPart.roll = z;
	}
}