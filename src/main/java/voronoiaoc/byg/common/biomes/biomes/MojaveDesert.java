package voronoiaoc.byg.common.biomes.biomes;

import com.google.common.collect.Maps;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;
import voronoiaoc.byg.common.biomes.BiomeHelper;
import voronoiaoc.byg.common.biomes.BiomeTools;
import voronoiaoc.byg.common.world.feature.biomefeatures.BYGFeatures;
import voronoiaoc.byg.common.world.feature.biomefeatures.BYGTreeFeatures;
import voronoiaoc.byg.core.byglists.BYGSBList;

import java.util.Collections;
import java.util.HashMap;

public class MojaveDesert extends Biome  {
    static final ConfiguredSurfaceBuilder SURFACE_BUILDER = BiomeHelper.newConfiguredSurfaceBuilder("mojave", new ConfiguredSurfaceBuilder<>(BYGSBList.MOJAVE, new TernarySurfaceConfig(Blocks.SAND.getDefaultState(), Blocks.SAND.getDefaultState(), Blocks.SANDSTONE.getDefaultState())));
    static final RainType PRECIPATATION = RainType.NONE;
    static final Category CATEGORY = Category.DESERT;
    static final float DEPTH = 0.125F;
    static final float SCALE = 0.05F;
    static final float TEMPERATURE = 2.0F;
    static final float DOWNFALL = 0.0F;
    static final int WATER_COLOR = 4159204;
    static final int WATER_FOG_COLOR = 329011;
    static final String PARENT = null;
    static final Weather WEATHER = new Weather(PRECIPATATION, TEMPERATURE, TemperatureModifier.NONE, DOWNFALL);
    static final MobSpawnInfo.Builder SPAWN_SETTINGS = new MobSpawnInfo.Builder();
    static final BiomeGenerationSettings.Builder GENERATION_SETTINGS = (new BiomeGenerationSettings.Builder()).func_242517_a(SURFACE_BUILDER);

    public MojaveDesert() {
       super(WEATHER, CATEGORY, DEPTH, SCALE, (new BiomeEffects.Builder()).waterColor(WATER_COLOR).waterFogColor(WATER_FOG_COLOR).fogColor(12638463).skyColor(BiomeHelper.calcSkyColor(0.8F)).moodSound(BiomeMoodSound.CAVE).build(), GENERATION_SETTINGS.build(), SPAWN_SETTINGS.build());
    }

    @Override
    public HashMap<Biome, Integer> getHills() {
        return Maps.newHashMap(Collections.singletonMap(BuiltinRegistries.BIOME.get(BuiltInBiomes.DESERT), 1));
    }


    static {
        //StructureFeature.VILLAGE.configure(new StructurePoolFeatureConfig(new Identifier("village/desert/town_centers"), 6));
        //this.add//StructureFeature(DefaultBiomeFeatures.PILLAGER_OUTPOST);
        DefaultBiomeFeatures.addDefaultUndergroundStructures(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addLandCarvers(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDungeons(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addMineables(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultOres(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultDisks(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultFlowers(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultGrass(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDesertDeadBushes(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultMushrooms(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDesertVegetation(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addSprings(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDesertFeatures(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addFrozenTopLayer(GENERATION_SETTINGS);
        BYGFeatures.addMiniCactus(GENERATION_SETTINGS);
        BYGTreeFeatures.addJoshuaTrees(GENERATION_SETTINGS);
        BYGFeatures.addBYGDesertPlants(GENERATION_SETTINGS);
        BYGFeatures.addFirecracker(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDesertVegetation(GENERATION_SETTINGS);
        BYGFeatures.addBYGMushrooms(GENERATION_SETTINGS);
        BYGFeatures.addGrass(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addBadlandsGrass(GENERATION_SETTINGS);
        BYGTreeFeatures.addBushes(GENERATION_SETTINGS);

        SPAWN_SETTINGS.func_242575_a(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners(EntityType.TROPICAL_FISH, 4, 2, 3));
        SPAWN_SETTINGS.func_242575_a(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners(EntityType.SALMON, 10, 8, 8));
        SPAWN_SETTINGS.func_242575_a(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.SPIDER, 100, 4, 4));
        SPAWN_SETTINGS.func_242575_a(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.SKELETON, 100, 4, 4));
        SPAWN_SETTINGS.func_242575_a(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.CREEPER, 100, 4, 4));
        SPAWN_SETTINGS.func_242575_a(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.SLIME, 100, 4, 4));
        SPAWN_SETTINGS.func_242575_a(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.ENDERMAN, 10, 1, 4));
        SPAWN_SETTINGS.func_242575_a(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.WITCH, 5, 1, 1));
        SPAWN_SETTINGS.func_242575_a(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.ZOMBIE, 19, 4, 4));
        SPAWN_SETTINGS.func_242575_a(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.ZOMBIE_VILLAGER, 1, 1, 1));
        SPAWN_SETTINGS.func_242575_a(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.HUSK, 80, 4, 4));

    }
}
