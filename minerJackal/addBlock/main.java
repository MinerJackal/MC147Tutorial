package minerJackal.addBlock;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import net.minecraft.block.Block;

@Mod(name = "Tutorial", modid = "tutorial", version = "1.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class main {

    public int blockID;
    public Block block;

    //ロード段階の初期化。
    //Configや一部のアイテム設定を行う
    @PreInit
    public void preLoad(FMLPreInitializationEvent event) {

    }

    //PreInitの次に読み込まれる初期化
    //
    @Init
    public void load(FMLInitializationEvent event) {

    }

    //Initの後に読み込まれる初期化。RMLのmodsLoadedメソッドのようなもの
    //他modとの連携を行うのはこの箇所。
    @PostInit
    public void postLoad(FMLPostInitializationEvent event) {

    }


}