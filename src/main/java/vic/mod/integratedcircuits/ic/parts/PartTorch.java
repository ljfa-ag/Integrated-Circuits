package vic.mod.integratedcircuits.ic.parts;

import vic.mod.integratedcircuits.ic.CircuitPart;
import net.minecraftforge.common.util.ForgeDirection;

public class PartTorch extends CircuitPart
{
	@Override
	public boolean getOutputToSide(ForgeDirection side) 
	{
		return true;
	}
}