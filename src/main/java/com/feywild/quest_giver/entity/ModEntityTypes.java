package com.feywild.quest_giver.entity;

import com.feywild.quest_giver.QuestGiverMod;
import io.github.noeppi_noeppi.libx.annotation.registration.RegisterClass;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

@RegisterClass
public class ModEntityTypes {

    public static final EntityType<QuestVillager> QUEST_VILLAGER = EntityType.Builder.of(
                    QuestVillager::new, MobCategory.CREATURE)
            .build(QuestGiverMod.getInstance().modid + "_quest_villager");

    public static final EntityType<QuestGuardVillager> QUEST_GUARD_VILLAGER = EntityType.Builder.of(
                    QuestGuardVillager::new, MobCategory.CREATURE)
            .build(QuestGiverMod.getInstance().modid + "_quest_guard_villager");
}
