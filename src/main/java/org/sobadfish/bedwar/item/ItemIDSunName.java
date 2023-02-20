package org.sobadfish.bedwar.item;


import cn.nukkit.item.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Winfxk
 * @author Anders233
 *
 */
public enum ItemIDSunName {
    /**
     * 石头
     */
    STONE("STONE"), 1, 0, "textures/blocks/stone.png"),
    /**
     * 花岗岩
     */
    STONE_GRANITE("STONE_GRANITE"), 1, 1, "textures/blocks/stone_granite.png"),
    /**
     * 磨制花岗岩
     */
    STONE_GRANITE_SMOOTH("STONE_GRANITE_SMOOTH"), 1, 2, "textures/blocks/stone_granite_smooth.png"),
    /**
     * 闪长岩
     */
    STONE_DIORITE("STONE_DIORITE"), 1, 3, "textures/blocks/stone_diorite.png"),
    /**
     * 磨制闪长岩
     */
    STONE_DIORITE_SMOOTH("STONE_DIORITE_SMOOTH"), 1, 4, "textures/blocks/stone_diorite_smooth.png"),
    /**
     * 安山岩
     */
    STONE_ANDESITE("STONE_ANDESITE"), 1, 5, "textures/blocks/stone_andesite.png"),
    /**
     * 磨制安山岩
     */
    STONE_ANDESITE_SMOOTH("STONE_ANDESITE_SMOOTH"), 1, 6, "textures/blocks/stone_andesite_smooth.png"),
    /**
     * 草方块
     */
    GRASS("GRASS"), 2, 0, "textures/blocks/grass_side_carried.png"),
    /**
     * 泥土
     */
    DIRT("DIRT"), 3, 0, "textures/blocks/dirt.png"),
    /**
     * 圆石
     */
    COBBLESTONE("COBBLESTONE"), 4, 0, "textures/blocks/cobblestone.png"),
    /**
     * 橡树木板
     */
    PLANKS("PLANKS"), 5, 0, "textures/blocks/planks_oak.png"),
    /**
     * 云杉木板
     */
    PLANKS_SPRUCE("PLANKS_SPRUCE"), 5, 1, "textures/blocks/planks_spruce.png"),
    /**
     * 桦木板
     */
    PLANKS_BIRCH("PLANKS_BIRCH"), 5, 2, "textures/blocks/planks_birch.png"),
    /**
     * 丛林树木板
     */
    PLANKS_JUNGLE("PLANKS_JUNGLE"), 5, 3, "textures/blocks/planks_jungle.png"),
    /**
     * 金合欢木板
     */
    PLANKS_ACACIA("PLANKS_ACACIA"), 5, 4, "textures/blocks/planks_acacia.png"),
    /**
     * 深色橡木木板
     */
    PLANKS_BIG_OAK("PLANKS_BIG_OAK"), 5, 5, "textures/blocks/planks_big_oak.png"),
    /**
     * 橡树苗
     */
    SAPLING("SAPLING"), 6, 0, "textures/blocks/sapling_oak.png"),
    /**
     * 云杉树苗
     */
    SAPLING_SPRUCE("SAPLING_SPRUCE"), 6, 1, "textures/blocks/sapling_spruce.png"),
    /**
     * 桦树苗
     */
    SAPLING_BIRCH("SAPLING_BIRCH"), 6, 2, "textures/blocks/sapling_birch.png"),
    /**
     * 丛林树苗
     */
    SAPLING_JUNGLE("SAPLING_JUNGLE"), 6, 3, "textures/blocks/sapling_jungle.png"),
    /**
     * 金合欢树苗
     */
    SAPLING_ACACIA("SAPLING_ACACIA"), 6, 4, "textures/blocks/sapling_acacia.png"),
    /**
     * 深色橡树苗
     */
    SAPLING_ROOFED_OAK("SAPLING_ROOFED_OAK"), 6, 5, "textures/blocks/sapling_roofed_oak.png"),
    /**
     * 基岩
     */
    BEDROCK("BEDROCK"), 7, 0, "textures/blocks/bedrock.png"),
    /**
     * 流动的水
     */
    FLOWING_WATER("FLOWING_WATER"), 8, 0, "textures/blocks/water_placeholder.png"),
    /**
     * 水
     */
    WATER("WATER"), 9, 0, "textures/blocks/water_placeholder.png"),
    /**
     * 流动的岩浆
     */
    FLOWING_LAVA("FLOWING_LAVA"), 10, 0, "textures/blocks/lava_placeholder.png"),
    /**
     * 岩浆
     */
    LAVA("LAVA"), 11, 0, "textures/blocks/lava_placeholder.png"),
    /**
     * 沙子
     */
    SAND("SAND"), 12, 0, "textures/blocks/sand.png"),
    /**
     * 红沙
     */
    RED_SAND("RED_SAND"), 12, 1, "textures/blocks/red_sand.png"),
    /**
     * 砾石
     */
    GRAVEL("GRAVEL"), 13, 0, "textures/blocks/gravel.png"),
    /**
     * 金矿石
     */
    GOLD_ORE("GOLD_ORE"), 14, 0, "textures/blocks/gold_ore.png"),
    /**
     * 铁矿石
     */
    IRON_ORE("IRON_ORE"), 15, 0, "textures/blocks/iron_ore.png"),
    /**
     * 煤矿石
     */
    COAL_ORE("COAL_ORE"), 16, 0, "textures/blocks/coal_ore.png"),
    /**
     * 橡木
     */
    LOG("LOG"), 17, 0, "textures/blocks/log_oak.png"),
    /**
     * 云杉木
     */
    LOG_SPRUCE("LOG_SPRUCE"), 17, 1, "textures/blocks/log_spruce.png"),
    /**
     * 桦木
     */
    LOG_BIRCH("LOG_BIRCH"), 17, 2, "textures/blocks/log_birch.png"),
    /**
     * 丛林木
     */
    LOG_JUNGLE("LOG_JUNGLE"), 17, 3, "textures/blocks/log_jungle.png"),
    /**
     * 橡树叶
     */
    LEAVES("LEAVES"), 18, 0, "textures/blocks/leaves_oak_carried.tga"),
    /**
     * 云杉叶
     */
    LEAVES_SPRUCE_CARRIED("LEAVES_SPRUCE_CARRIED"), 18, 1, "textures/blocks/leaves_spruce_carried.tga"),
    /**
     * 桦树叶
     */
    LEAVES_BIRCH_CARRIED("LEAVES_BIRCH_CARRIED"), 18, 2, "textures/blocks/leaves_birch_carried.tga"),
    /**
     * 丛林树叶
     */
    LEAVES_JUNGLE_CARRIED("LEAVES_JUNGLE_CARRIED"), 18, 3, "textures/blocks/leaves_jungle_carried.tga"),
    /**
     * 干海绵
     */
    SPONGE("SPONGE"), 19, 0, "textures/blocks/sponge.png"),
    /**
     * 湿海绵
     */
    SPONGE_WET("SPONGE_WET"), 19, 1, "textures/blocks/sponge_wet.png"),
    /**
     * 玻璃
     */
    GLASS("GLASS"), 20, 0, "textures/blocks/glass.png"),
    /**
     * 青金石矿
     */
    LAPIS_ORE("LAPIS_ORE"), 21, 0, "textures/blocks/lapis_ore.png"),
    /**
     * 青金石块
     */
    LAPIS_BLOCK("LAPIS_BLOCK"), 22, 0, "textures/blocks/lapis_block.png"),
    /**
     * 发射器
     */
    DISPENSER("DISPENSER"), 23, 0, "textures/blocks/dispenser_front_horizontal.png"),
    /**
     * 沙石
     */
    SANDSTONE("SANDSTONE"), 24, 0, "textures/blocks/sandstone_normal.png"),
    /**
     * 錾制沙石
     */
    SANDSTONE_CARVED("SANDSTONE_CARVED"), 24, 1, "textures/blocks/sandstone_carved.png"),
    /**
     * 光滑沙石
     */
    SANDSTONE_SMOOTH("SANDSTONE_SMOOTH"), 24, 2, "textures/blocks/sandstone_smooth.png"),
    /**
     * 音符盒
     */
    NOTEBLOCK("NOTEBLOCK"), 25, 0, "textures/blocks/noteblock.png"),
    /**
     * 方块床
     */
    BED_BLOCK("BED_BLOCK"), 26, 0, "textures/blocks/bed_head_top.png"),
    /**
     * 动力铁轨
     */
    GOLDEN_RAIL("GOLDEN_RAIL"), 27, 0, "textures/blocks/rail_golden.png"),
    /**
     * 探测铁轨
     */
    DETECTOR_RAIL("DETECTOR_RAIL"), 28, 0, "textures/blocks/rail_detector.png"),
    /**
     * 粘性活塞
     */
    STICKY_PISTON("STICKY_PISTON"), 29, 0, "textures/blocks/piston_top_sticky.png"),
    /**
     * 蜘蛛网
     */
    WEB("WEB"), 30, 0, "textures/blocks/web.png"),
    /**
     * 高草
     */
    TALLGRASS("TALLGRASS"), 31, 0, "textures/blocks/deadbush.png"),
    /**
     * 草
     */
    TALLGRASS_CARRIED("TALLGRASS_CARRIED"), 31, 1, "textures/blocks/tallgrass_carried.tga"),
    /**
     * 蕨
     */
    FERN_CARRIED("FERN_CARRIED"), 31, 2, "textures/blocks/fern_carried.tga"),
    /**
     * 枯死的灌木
     */
    DEADBUSH("DEADBUSH"), 32, 0, "textures/blocks/deadbush.png"),
    /**
     * 活塞
     */
    PISTON("PISTON"), 33, 0, "textures/blocks/piston_top_normal.png"),
    /**
     * 活塞臂
     */
    PISTON_HEAD("PISTON_HEAD"), 34, 0, "textures/blocks/piston_top_normal.png"),
    /**
     * 白色羊毛
     */
    WOOL("WOOL"), 35, 0, "textures/blocks/wool_colored_white.png"),
    /**
     * 橙色羊毛
     */
    WOOL_COLORED_ORANGE("WOOL_COLORED_ORANGE"), 35, 1, "textures/blocks/wool_colored_orange.png"),
    /**
     * 品红色羊毛
     */
    WOOL_COLORED_MAGENTA("WOOL_COLORED_MAGENTA"), 35, 2, "textures/blocks/wool_colored_magenta.png"),
    /**
     * 淡蓝色羊毛
     */
    WOOL_COLORED_LIGHT_BLUE("WOOL_COLORED_LIGHT_BLUE"), 35, 3, "textures/blocks/wool_colored_light_blue.png"),
    /**
     * 黄色羊毛
     */
    WOOL_COLORED_YELLOW("WOOL_COLORED_YELLOW"), 35, 4, "textures/blocks/wool_colored_yellow.png"),
    /**
     * 黄绿色羊毛
     */
    WOOL_COLORED_LIME("WOOL_COLORED_LIME"), 35, 5, "textures/blocks/wool_colored_lime.png"),
    /**
     * 粉红色羊毛
     */
    WOOL_COLORED_PINK("WOOL_COLORED_PINK"), 35, 6, "textures/blocks/wool_colored_pink.png"),
    /**
     * 灰色羊毛
     */
    WOOL_COLORED_GRAY("WOOL_COLORED_GRAY"), 35, 7, "textures/blocks/wool_colored_gray.png"),
    /**
     * 淡灰色羊毛
     */
    WOOL_COLORED_SILVER("WOOL_COLORED_SILVER"), 35, 8, "textures/blocks/wool_colored_silver.png"),
    /**
     * 青色羊毛
     */
    WOOL_COLORED_CYAN("WOOL_COLORED_CYAN"), 35, 9, "textures/blocks/wool_colored_cyan.png"),
    /**
     * 紫色羊毛
     */
    WOOL_COLORED_PURPLE("WOOL_COLORED_PURPLE"), 35, 10, "textures/blocks/wool_colored_purple.png"),
    /**
     * 蓝色羊毛
     */
    WOOL_COLORED_BLUE("WOOL_COLORED_BLUE"), 35, 11, "textures/blocks/wool_colored_blue.png"),
    /**
     * 棕色羊毛
     */
    WOOL_COLORED_BROWN("WOOL_COLORED_BROWN"), 35, 12, "textures/blocks/wool_colored_brown.png"),
    /**
     * 绿色羊毛
     */
    WOOL_COLORED_GREEN("WOOL_COLORED_GREEN"), 35, 13, "textures/blocks/wool_colored_green.png"),
    /**
     * 红色羊毛
     */
    WOOL_COLORED_RED("WOOL_COLORED_RED"), 35, 14, "textures/blocks/wool_colored_red.png"),
    /**
     * 黑色羊毛
     */
    WOOL_COLORED_BLACK("WOOL_COLORED_BLACK"), 35, 15, "textures/blocks/wool_colored_black.png"),
    /**
     * 黄花
     */
    YELLOW_FLOWER("YELLOW_FLOWER"), 37, 0, "textures/blocks/glazed_terracotta_yellow.png"),
    /**
     * 罂粟
     */
    RED_FLOWER("RED_FLOWER"), 38, 0, "textures/blocks/flower_rose.png"),
    /**
     * 蓝色的兰花
     */
    FLOWER_BLUE_ORCHID("FLOWER_BLUE_ORCHID"), 38, 1, "textures/blocks/flower_blue_orchid.png"),
    /**
     * 绒球葱
     */
    FLOWER_ALLIUM("FLOWER_ALLIUM"), 38, 2, "textures/blocks/flower_allium.png"),
    /**
     * 茜草花
     */
    FLOWER_HOUSTONIA("FLOWER_HOUSTONIA"), 38, 3, "textures/blocks/flower_houstonia.png"),
    /**
     * 红色郁金香
     */
    FLOWER_TULIP_RED("FLOWER_TULIP_RED"), 38, 4, "textures/blocks/flower_tulip_red.png"),
    /**
     * 橙色郁金香
     */
    FLOWER_TULIP_ORANGE("FLOWER_TULIP_ORANGE"), 38, 5, "textures/blocks/flower_tulip_orange.png"),
    /**
     * 白色郁金香
     */
    FLOWER_TULIP_WHITE("FLOWER_TULIP_WHITE"), 38, 6, "textures/blocks/flower_tulip_white.png"),
    /**
     * 粉色郁金香
     */
    FLOWER_TULIP_PINK("FLOWER_TULIP_PINK"), 38, 7, "textures/blocks/flower_tulip_pink.png"),
    /**
     * 滨菊
     */
    FLOWER_OXEYE_DAISY("FLOWER_OXEYE_DAISY"), 38, 8, "textures/blocks/flower_oxeye_daisy.png"),
    /**
     * 棕色蘑菇
     */
    BROWN_MUSHROOM("BROWN_MUSHROOM"), 39, 0, "textures/blocks/mushroom_brown.png"),
    /**
     * 红色蘑菇
     */
    RED_MUSHROOM("RED_MUSHROOM"), 40, 0, "textures/blocks/mushroom_red.png"),
    /**
     * 黄金块
     */
    GOLD_BLOCK("GOLD_BLOCK"), 41, 0, "textures/blocks/gold_block.png"),
    /**
     * 铁块
     */
    IRON_BLOCK("IRON_BLOCK"), 42, 0, "textures/blocks/iron_block.png"),
    /**
     * 双石台阶
     */
    DOUBLE_STONE_SLAB("DOUBLE_STONE_SLAB"), 43, 0, "textures/blocks/stone_slab_side.png"),
    /**
     * 双沙石台阶
     */
    SANDSTONE_BOTTOM("SANDSTONE_BOTTOM"), 43, 1, "textures/blocks/sandstone_bottom.png"),
    /**
     * 双橡木台阶
     */
    PLANKS_OAK("PLANKS_OAK"), 43, 2, "textures/blocks/planks_oak.png"),
    /**
     * 双圆石台阶
     */
    DOUBLE_PEBBLE_STEPS("DOUBLE_PEBBLE_STEPS"), 43, 3, "textures/blocks/cobblestone.png"),
    /**
     * 双砖台阶
     */
    DOUBLE_BRICK_STEPS("DOUBLE_BRICK_STEPS"), 43, 4, "textures/blocks/brick.png"),
    /**
     * 双石砖台阶
     */
    DOUBLE_STONE_BRICK_STEPS("DOUBLE_STONE_BRICK_STEPS"), 43, 5, "textures/blocks/stonebrick.png"),
    /**
     * 双石英台阶
     */
    DOUBLE_QUARTZ_STEPS("DOUBLE_QUARTZ_STEPS"), 43, 6, "textures/blocks/nether_brick.png"),
    /**
     * 双地狱砖台阶
     */
    DOUBLE_HELL_BRICK_STEPS("DOUBLE_HELL_BRICK_STEPS"), 43, 7, "textures/blocks/quartz_block_top.png"),
    /**
     * 石台阶
     */
    STONE_SLAB("STONE_SLAB"), 44, 0, "textures/blocks/stone_slab_top.png"),
    /**
     * 沙石台阶
     */
    SANDSTONE_TOP("SANDSTONE_TOP"), 44, 1, "textures/blocks/sandstone_top.png"),
    /**
     * 圆石台阶
     */
    COBBLESTONE_STEPS("COBBLESTONE_STEPS"), 44, 3, "textures/blocks/cobblestone.png"),
    /**
     * 砖台阶
     */
    BRICK_STEPS("BRICK_STEPS"), 44, 4, "textures/blocks/brick.png"),
    /**
     * 石砖台阶
     */
    STONEBRICK_STEPS("STONEBRICK_STEPS"), 44, 5, "textures/blocks/stonebrick.png"),
    /**
     * 石英台阶
     */
    NETHER_BRICK_STEPS("NETHER_BRICK_STEPS"), 44, 6, "textures/blocks/nether_brick.png"),
    /**
     * 地狱砖台阶
     */
    QUARTZ_BLOCK_TOP_STEPS("QUARTZ_BLOCK_TOP_STEPS"), 44, 7, "textures/blocks/quartz_block_top.png"),
    /**
     * 砖
     */
    BRICK("BRICK"), 336, 0, "textures/blocks/brick.png"),
    /**
     * TNT
     */
    TNT("TNT"), 46, 0, "textures/blocks/tnt_side.png"),
    /**
     * 书架
     */
    BOOKSHELF("BOOKSHELF"), 47, 0, "textures/blocks/bookshelf.png"),
    /**
     * 苔石
     */
    MOSSY_COBBLESTONE("MOSSY_COBBLESTONE"), 48, 0, "textures/blocks/cobblestone_mossy.png"),
    /**
     * 黑曜石
     */
    OBSIDIAN("OBSIDIAN"), 49, 0, "textures/blocks/obsidian.png"),
    /**
     * 火把
     */
    TORCH("TORCH"), 50, 0, "textures/blocks/torch_on.png"),
    /**
     * 火
     */
    FIRE("FIRE"), 51, 0, "textures/blocks/fire_0_placeholder.png"),
    /**
     * 刷怪笼
     */
    MOB_SPAWNER("MOB_SPAWNER"), 52, 0, "textures/blocks/mob_spawner.png"),
    /**
     * 橡木阶梯
     */
    OAK_STAIRS("OAK_STAIRS"), 53, 0, "textures/blocks/planks_oak.png"),
    /**
     * 箱子
     */
    CHEST("CHEST"), 54, 0, "textures/blocks/chest_front.png"),
    /**
     * 红石粉
     */
    REDSTONE_WIRE("REDSTONE_WIRE"), 55, 0, "textures/blocks/redstone_dust_line.png"),
    /**
     * 钻石矿
     */
    DIAMOND_ORE("DIAMOND_ORE"), 56, 0, "textures/blocks/diamond_ore.png"),
    /**
     * 钻石块
     */
    DIAMOND_BLOCK("DIAMOND_BLOCK"), 57, 0, "textures/blocks/diamond_block.png"),
    /**
     * 工作台
     */
    CRAFTING_TABLE("CRAFTING_TABLE"), 58, 0, "textures/blocks/crafting_table_top.png"),
    /**
     * 农田
     */
    FARMLAND("FARMLAND"), 60, 0, "textures/blocks/farmland_dry.png"),
    /**
     * 熔炉
     */
    FURNACE("FURNACE"), 61, 0, "textures/blocks/furnace_front_off.png"),
    /**
     * 梯子
     */
    LADDER("LADDER"), 65, 0, "textures/blocks/ladder.png"),
    /**
     * 铁轨
     */
    RAIL("RAIL"), 66, 0, "textures/blocks/rail_normal.png"),
    /**
     * 圆石阶梯
     */
    STONE_STAIRS("STONE_STAIRS"), 67, 0, "textures/blocks/cobblestone.png"),
    /**
     * 拉杆
     */
    LEVER("LEVER"), 69, 0, "textures/blocks/lever.png"),
    /**
     * 石质压力板
     */
    STONE_PRESSURE_PLATE("STONE_PRESSURE_PLATE"), 70, 0, "textures/blocks/stone.png"),
    /**
     * 木质压力板
     */
    WOODEN_PRESSURE_PLATE("WOODEN_PRESSURE_PLATE"), 72, 0, "textures/blocks/planks_oak.png"),
    /**
     * 红石矿
     */
    REDSTONE_ORE("REDSTONE_ORE"), 73, 0, "textures/blocks/redstone_ore.png"),
    /**
     * 发光的红石矿
     */
    LIT_REDSTONE_ORE("LIT_REDSTONE_ORE"), 74, 0, "textures/blocks/redstone_ore.png"),
    /**
     * 红石火把
     */
    UNLIT_REDSTONE_TORCH("UNLIT_REDSTONE_TORCH"), 75, 0, "textures/blocks/redstone_torch_off.png"),
    /**
     * 石质按钮
     */
    STONE_BUTTON("STONE_BUTTON"), 77, 0, "textures/blocks/stone.png"),
    /**
     * 顶层雪
     */
    SNOW_LAYER("SNOW_LAYER"), 78, 0, "textures/blocks/snow.png"),
    /**
     * 冰
     */
    ICE("ICE"), 79, 0, "textures/blocks/ice.png"),
    /**
     * 雪
     */
    SNOW("SNOW"), 80, 0, "textures/blocks/snow.png"),
    /**
     * 仙人掌
     */
    CACTUS("CACTUS"), 81, 0, "textures/blocks/cactus_side.tga"),
    /**
     * 粘土
     */
    CLAY("CLAY"), 82, 0, "textures/blocks/clay.png"),
    /**
     * 音乐盒
     */
    JUKEBOX("JUKEBOX"), 84, 0, "textures/blocks/jukebox_top.png"),
    /**
     * 橡木围墙
     */
    FENCE("FENCE"), 85, 0, "textures/blocks/planks_oak.png"),
    /**
     * 南瓜
     */
    PUMPKIN("PUMPKIN"), 86, 0, "textures/blocks/pumpkin_face_off.png"),
    /**
     * 地狱岩
     */
    NETHERRACK("NETHERRACK"), 87, 0, "textures/blocks/netherrack.png"),
    /**
     * 灵魂沙
     */
    SOUL_SAND("SOUL_SAND"), 88, 0, "textures/blocks/soul_sand.png"),
    /**
     * 萤石
     */
    GLOWSTONE("GLOWSTONE"), 89, 0, "textures/blocks/glowstone.png"),
    /**
     * 传送门
     */
    PORTAL("PORTAL"), 90, 0, "textures/blocks/portal_placeholder.png"),
    /**
     * 南瓜灯
     */
    LIT_PUMPKIN("LIT_PUMPKIN"), 91, 0, "textures/blocks/pumpkin_face_on.png"),
    /**
     * 隐形基岩
     */
    STAINED_GLASS("STAINED_GLASS"), 95, 0, "textures/blocks/glass_white.png"),
    /**
     * 木质陷阱门
     */
    TRAPDOOR("TRAPDOOR"), 96, 0, "textures/blocks/trapdoor.png"),
    /**
     * 石头刷怪蛋
     */
    MONSTER_EGG("MONSTER_EGG"), 97, 0, "textures/blocks/stone.png"),
    /**
     * 圆石刷怪蛋
     */
    COBBLESTONE_EGG("COBBLESTONE_EGG"), 97, 1, "textures/blocks/Cobblestone.png"),
    /**
     * 石砖刷怪蛋
     */
    STONEBRICK("STONEBRICK"), 97, 2, "textures/blocks/stonebrick.png"),
    /**
     * 苔石砖
     */
    STONEBRICK_MOSSY("STONEBRICK_MOSSY"), 98, 1, "textures/blocks/stonebrick_mossy.png"),
    /**
     * 裂石砖
     */
    STONEBRICK_CRACKED("STONEBRICK_CRACKED"), 98, 2, "textures/blocks/stonebrick_cracked.png"),
    /**
     * 錾制石砖
     */
    STONEBRICK_CARVED("STONEBRICK_CARVED"), 98, 3, "textures/blocks/stonebrick_carved.png"),
    /**
     * 棕色蘑菇块
     */
    BROWN_MUSHROOM_BLOCK("BROWN_MUSHROOM_BLOCK"), 99, 0, "textures/blocks/mushroom_block_skin_brown.png"),
    /**
     * 红色蘑菇块
     */
    RED_MUSHROOM_BLOCK("RED_MUSHROOM_BLOCK"), 100, 0, "textures/blocks/mushroom_block_skin_red.png"),
    /**
     * 铁栏杆
     */
    IRON_BARS("IRON_BARS"), 101, 0, "textures/blocks/iron_bars.png"),
    /**
     * 玻璃板
     */
    GLASS_PANE("GLASS_PANE"), 102, 0, "textures/blocks/glass_pane_top.png"),
    /**
     * 南瓜梗
     */
    PUMPKIN_STEM("PUMPKIN_STEM"), 104, 0, "textures/blocks/pumpkin_stem_disconnected.png"),
    /**
     * 藤蔓
     */
    VINE("VINE"), 106, 0, "textures/blocks/vine_carried.png"),
    /**
     * 橡木围墙大门
     */
    FENCE_GATE("FENCE_GATE"), 107, 0, "textures/blocks/planks_oak.png"),
    /**
     * 砖块阶梯
     */
    BRICK_STAIRS("BRICK_STAIRS"), 108, 0, "textures/blocks/brick.png"),
    /**
     * 石砖阶梯
     */
    STONE_BRICK_STAIRS("STONE_BRICK_STAIRS"), 109, 0, "textures/blocks/stonebrick.png"),
    /**
     * 菌丝
     */
    MYCELIUM("MYCELIUM"), 110, 0, "textures/blocks/mycelium_side.png"),
    /**
     * 睡莲
     */
    WATERLILY("WATERLILY"), 111, 0, "textures/blocks/carried_waterlily.png"),
    /**
     * 地狱砖
     */
    NETHERBRICK("NETHERBRICK"), 405, 0, "textures/blocks/nether_brick.png"),
    /**
     * 地狱砖围墙
     */
    NETHER_BRICK_FENCE("NETHER_BRICK_FENCE"), 113, 0, "textures/blocks/nether_brick.png"),
    /**
     * 地狱砖阶梯
     */
    NETHER_BRICK_STAIRS("NETHER_BRICK_STAIRS"), 114, 0, "textures/blocks/nether_brick.png"),
    /**
     * 附魔台
     */
    ENCHANTING_TABLE("ENCHANTING_TABLE"), 116, 0, "textures/blocks/enchanting_table_side.png"),
    /**
     * 酿造台
     */
    BREWING_STAND("BREWING_STAND"), 379, 0, "textures/blocks/brewing_stand.png"),
    /**
     * 炼药锅
     */
    CAULDRON("CAULDRON"), 380, 0, "textures/blocks/cauldron_side.png"),
    /**
     * 末地门
     */
    END_PORTAL("END_PORTAL"), 119, 0, "textures/blocks/end_portal.png"),
    /**
     * 末地传送门
     */
    END_PORTAL_FRAME("END_PORTAL_FRAME"), 120, 0, "textures/blocks/end_portal.png"),
    /**
     * 末地石
     */
    END_STONE("END_STONE"), 121, 0, "textures/blocks/end_stone.png"),
    /**
     * 龙蛋
     */
    DRAGON_EGG("DRAGON_EGG"), 122, 0, "textures/blocks/dragon_egg.png"),
    /**
     * 红石灯
     */
    REDSTONE_LAMP("REDSTONE_LAMP"), 123, 0, "textures/blocks/redstone_lamp_off.png"),
    /**
     * 沙石阶梯
     */
    SANDSTONE_STAIRS("SANDSTONE_STAIRS"), 128, 0, "textures/blocks/sandstone_bottom.png"),
    /**
     * 绿宝石矿石
     */
    EMERALD_ORE("EMERALD_ORE"), 129, 0, "textures/blocks/emerald_ore.png"),
    /**
     * 末影箱
     */
    ENDER_CHEST("ENDER_CHEST"), 130, 0, "textures/blocks/ender_chest_front.png"),
    /**
     * 拌线钩
     */
    TRIPWIRE_HOOK("TRIPWIRE_HOOK"), 131, 0, "textures/blocks/trip_wire_source.png"),
    /**
     * 拌线
     */
    TRIPWIRE("TRIPWIRE"), 132, 0, "textures/blocks/trip_wire.png"),
    /**
     * 绿宝石块
     */
    EMERALD_BLOCK("EMERALD_BLOCK"), 133, 0, "textures/blocks/emerald_block.png"),
    /**
     * 云杉木阶梯
     */
    SPRUCE_STAIRS("SPRUCE_STAIRS"), 134, 0, "textures/blocks/planks_spruce.png"),
    /**
     * 桦木阶梯
     */
    BIRCH_STAIRS("BIRCH_STAIRS"), 135, 0, "textures/blocks/planks_birch.png"),
    /**
     * 丛林木阶梯
     */
    JUNGLE_STAIRS("JUNGLE_STAIRS"), 136, 0, "textures/blocks/planks_jungle.png"),
    /**
     * 命令方块
     */
    COMMAND_BLOCK("COMMAND_BLOCK"), 137, 0, "textures/blocks/command_block.png"),
    /**
     * 信标
     */
    BEACON("BEACON"), 138, 0, "textures/blocks/beacon.png"),
    /**
     * 圆石墙
     */
    COBBLESTONE_WALL("COBBLESTONE_WALL"), 139, 0, "textures/blocks/cobblestone.png"),
    /**
     * 苔石墙
     */
    MOSS_COBBLESTONE_WALL("MOSS_COBBLESTONE_WALL"), 139, 1, "textures/blocks/cobblestone_mossy.png"),
    /**
     * 土豆
     */
    POTATOES("POTATOES"), 142, 0, "textures/blocks/potatoes_stage_3.png"),
    /**
     * 木质按钮
     */
    WOODEN_BUTTON("WOODEN_BUTTON"), 143, 0, "textures/blocks/planks_oak.png"),
    /**
     * 铁砧
     */
    ANVIL("ANVIL"), 145, 0, "textures/blocks/anvil_top_damaged_0.png"),
    /**
     * 陷阱箱
     */
    TRAPPED_CHEST("TRAPPED_CHEST"), 146, 0, "textures/blocks/trapped_chest_front.png"),
    /**
     * 重力压力板(轻型)
     */
    LIGHT_WEIGHTED_PRESSURE_PLATE("LIGHT_WEIGHTED_PRESSURE_PLATE"), 147, 0, "textures/blocks/gold_block.png"),
    /**
     * 重力压力板(重型)
     */
    HEAVY_WEIGHTED_PRESSURE_PLATE("HEAVY_WEIGHTED_PRESSURE_PLATE"), 148, 0, "textures/blocks/iron_block.png"),
    /**
     * 阳光传感器
     */
    DAYLIGHT_DETECTOR_INVERTED("DAYLIGHT_DETECTOR_INVERTED"), 178, 0, "textures/blocks/daylight_detector_inverted_top.png"),
    /**
     * 红石块
     */
    REDSTONE_BLOCK("REDSTONE_BLOCK"), 152, 0, "textures/blocks/redstone_block.png"),
    /**
     * 地狱石英矿石
     */
    QUARTZ_ORE("QUARTZ_ORE"), 153, 0, "textures/blocks/quartz_ore.png"),
    /**
     * 漏斗
     */
    HOPPER("HOPPER"), 154, 0, "textures/blocks/hopper_top.png"),
    /**
     * 石英块
     */
    QUARTZ_BLOCK("QUARTZ_BLOCK"), 155, 0, "textures/blocks/quartz_block_top.png"),
    /**
     * 竖纹石英块
     */
    VERTICAL_GRAIN_QUARTZ_BLOCK("VERTICAL_GRAIN_QUARTZ_BLOCK"), 155, 1, "textures/blocks/quartz_block_lines.png"),
    /**
     * 錾制石英块
     */
    QUARTZ_BLOCK_CHISELED("QUARTZ_BLOCK_CHISELED"), 155, 2, "textures/blocks/quartz_block_chiseled_top.png"),
    /**
     * 石英阶梯
     */
    QUARTZ_STAIRS("QUARTZ_STAIRS"), 156, 0, "textures/blocks/quartz_block_top.png"),
    /**
     * 橡木台阶
     */
    OAK_WOOD_STAIRS("OAK_WOOD_STAIRS"), 158, 0, "textures/blocks/planks_oak.png"),
    /**
     * 白色粘土
     */
    WHITE_STAINED_HARDENED_CLAY("WHITE_STAINED_HARDENED_CLAY"), 159, 0, "textures/blocks/hardened_clay_stained_white.png"),
    /**
     * 橙色粘土
     */
    ORANGE_STAINED_HARDENED_CLAY("ORANGE_STAINED_HARDENED_CLAY"), 159, 1, "textures/blocks/hardened_clay_stained_orange.png"),
    /**
     * 品红色粘土
     */
    SOLFERINO_STAINED_HARDENED_CLAY("SOLFERINO_STAINED_HARDENED_CLAY"), 159, 2, "textures/blocks/hardened_clay_stained_magenta.png"),
    /**
     * 淡蓝色粘土
     */
    LIGHT_BLUE_STAINED_HARDENED_CLAY("LIGHT_BLUE_STAINED_HARDENED_CLAY"), 159, 3, "textures/blocks/hardened_clay_stained_light_blue.png"),
    /**
     * 黄色粘土
     */
    YELLOW_STAINED_HARDENED_CLAY("YELLOW_STAINED_HARDENED_CLAY"), 159, 4, "textures/blocks/hardened_clay_stained_yellow.png"),
    /**
     * 黄绿色粘土
     */
    OLIVINE_STAINED_HARDENED_CLAY("OLIVINE_STAINED_HARDENED_CLAY"), 159, 5, "textures/blocks/hardened_clay_stained_lime.png"),
    /**
     * 粉红色粘土
     */
    PINK_STAINED_HARDENED_CLAY("PINK_STAINED_HARDENED_CLAY"), 159, 6, "textures/blocks/hardened_clay_stained_pink.png"),
    /**
     * 灰色粘土
     */
    GRAY_STAINED_HARDENED_CLAY("GRAY_STAINED_HARDENED_CLAY"), 159, 7, "textures/blocks/hardened_clay_stained_gray.png"),
    /**
     * 淡灰色粘土
     */
    LIGHT_GRAY_STAINED_HARDENED_CLAY("LIGHT_GRAY_STAINED_HARDENED_CLAY"), 159, 8, "textures/blocks/concrete_gray.png"),
    /**
     * 青色粘土
     */
    CYAN_STAINED_HARDENED_CLAY("CYAN_STAINED_HARDENED_CLAY"), 159, 9, "textures/blocks/hardened_clay_stained_lime.png"),
    /**
     * 紫色粘土
     */
    VIOLET_STAINED_HARDENED_CLAY("VIOLET_STAINED_HARDENED_CLAY"), 159, 10, "textures/blocks/hardened_clay_stained_purple.png"),
    /**
     * 蓝色粘土
     */
    BLUE_STAINED_HARDENED_CLAY("BLUE_STAINED_HARDENED_CLAY"), 159, 11, "textures/blocks/hardened_clay_stained_blue.png"),
    /**
     * 棕色粘土
     */
    BROWN_STAINED_HARDENED_CLAY("BROWN_STAINED_HARDENED_CLAY"), 159, 12, "textures/blocks/hardened_clay_stained_brown.png"),
    /**
     * 绿色粘土
     */
    GREEN_STAINED_HARDENED_CLAY("GREEN_STAINED_HARDENED_CLAY"), 159, 13, "textures/blocks/hardened_clay_stained_green.png"),
    /**
     * 红色粘土
     */
    RED_STAINED_HARDENED_CLAY("RED_STAINED_HARDENED_CLAY"), 159, 14, "textures/blocks/hardened_clay_stained_red.png"),
    /**
     * 黑色粘土
     */
    BLACK_STAINED_HARDENED_CLAY("BLACK_STAINED_HARDENED_CLAY"), 159, 15, "textures/blocks/hardened_clay_stained_black.png"),
    /**
     * 白色玻璃板
     */
    WHITE_STAINED_GLASS_PANE("WHITE_STAINED_GLASS_PANE"), 160, 0, "textures/blocks/glass_pane_top_white.png"),
    /**
     * 橙色玻璃板
     */
    ORANGE_STAINED_GLASS_PANE("ORANGE_STAINED_GLASS_PANE"), 160, 1, "textures/blocks/glass_pane_top_orange.png"),
    /**
     * 品红色玻璃板
     */
    SOLFERINO_STAINED_GLASS_PANE("SOLFERINO_STAINED_GLASS_PANE"), 160, 2, "textures/blocks/glass_pane_top_magenta.png"),
    /**
     * 淡蓝色玻璃板
     */
    LIGHT_BLUE_STAINED_GLASS_PANE("LIGHT_BLUE_STAINED_GLASS_PANE"), 160, 3, "textures/blocks/glass_light_blue.png"),
    /**
     * 黄色玻璃板
     */
    YELLOW_STAINED_GLASS_PANE("YELLOW_STAINED_GLASS_PANE"), 160, 4, "textures/blocks/glass_yellow.png"),
    /**
     * 黄绿色玻璃板
     */
    OLIVINE_STAINED_GLASS_PANE("OLIVINE_STAINED_GLASS_PANE"), 160, 5, "textures/blocks/glass_pane_top_lime.png"),
    /**
     * 粉红色玻璃板
     */
    PINK_STAINED_GLASS_PANE("PINK_STAINED_GLASS_PANE"), 160, 6, "textures/blocks/glass_pane_top_pink.png"),
    /**
     * 灰色玻璃板
     */
    GRAY_STAINED_GLASS_PANE("GRAY_STAINED_GLASS_PANE"), 160, 7, "textures/blocks/glass_gray.png"),
    /**
     * 淡灰色玻璃板
     */
    LIGHT_GRAY_STAINED_GLASS_PANE("LIGHT_GRAY_STAINED_GLASS_PANE"), 160, 8, "textures/blocks/glass_brown.png"),
    /**
     * 青色玻璃板
     */
    CYAN_STAINED_GLASS_PANE("CYAN_STAINED_GLASS_PANE"), 160, 9, "textures/blocks/glass_pane_top_cyan.png"),
    /**
     * 紫色玻璃板
     */
    VIOLET_STAINED_GLASS_PANE("VIOLET_STAINED_GLASS_PANE"), 160, 10, "textures/blocks/glass_pane_top_purple.png"),
    /**
     * 蓝色玻璃板
     */
    BLUE_STAINED_GLASS_PANE("BLUE_STAINED_GLASS_PANE"), 160, 11, "textures/blocks/glass_blue.png"),
    /**
     * 棕色玻璃板
     */
    BROWN_STAINED_GLASS_PANE("BROWN_STAINED_GLASS_PANE"), 160, 12, "textures/blocks/glass_brown.png"),
    /**
     * 绿色玻璃板
     */
    GREEN_STAINED_GLASS_PANE("GREEN_STAINED_GLASS_PANE"), 160, 13, "textures/blocks/glass_pane_top_green.png"),
    /**
     * 红色玻璃板
     */
    RED_STAINED_GLASS_PANE("RED_STAINED_GLASS_PANE"), 160, 14, "textures/blocks/glass_red.png"),
    /**
     * 黑色玻璃板
     */
    BLACK_STAINED_GLASS_PANE("BLACK_STAINED_GLASS_PANE"), 160, 15, "textures/blocks/glass_black.png"),
    /**
     * 金合欢叶
     */
    ACACIA_LEAVES("ACACIA_LEAVES"), 161, 0, "textures/blocks/leaves_acacia_opaque.png"),
    /**
     * 深色橡树叶
     */
    DARK_OAK_LEAF("DARK_OAK_LEAF"), 161, 1, "textures/blocks/leaves_big_oak_opaque.png"),
    /**
     * 金合欢木
     */
    ACACIA_WOOD("ACACIA_WOOD"), 162, 0, "textures/blocks/log_acacia.png"),
    /**
     * 深色橡木
     */
    DARK_OAK("DARK_OAK"), 162, 1, "textures/blocks/log_acacia.png"),
    /**
     * 金合欢木阶梯
     */
    ACACIA_STAIRS("ACACIA_STAIRS"), 163, 0, "textures/blocks/planks_acacia.png"),
    /**
     * 深色橡木阶梯
     */
    DARK_OAK_STAIRS("DARK_OAK_STAIRS"), 164, 0, "textures/blocks/planks_big_oak.png"),
    /**
     * 粘液块
     */
    SLIME("SLIME"), 165, 0, "textures/blocks/slime.png"),
    /**
     * 铁门
     */
    IRON_DOOR("IRON_DOOR"), 330, 0, "textures/blocks/door_iron_upper.png"),
    /**
     * 海晶石
     */
    PRISMARINE("PRISMARINE"), 168, 0, "textures/blocks/prismarine_dark.png"),
    /**
     * 暗海晶石
     */
    DARK_PRISMARINE("DARK_PRISMARINE"), 168, 1, "textures/blocks/prismarine_dark.png"),
    /**
     * 海晶石砖
     */
    PRISMARINE_STONE_BRICK("PRISMARINE_STONE_BRICK"), 168, 2, "textures/blocks/prismarine_bricks.png"),
    /**
     * 海晶灯
     */
    SEA_LANTERN("SEA_LANTERN"), 169, 0, "textures/blocks/sea_lantern.png"),
    /**
     * 干草捆
     */
    HAY_BLOCK("HAY_BLOCK"), 170, 0, "textures/blocks/hay_block_side.png"),
    /**
     * 白色地毯
     */
    WHITE_CARPET("WHITE_CARPET"), 171, 0, "textures/blocks/wool_colored_white.png"),
    /**
     * 橙色地毯
     */
    ORANGE_CARPET("ORANGE_CARPET"), 171, 1, "textures/blocks/wool_colored_orange.png"),
    /**
     * 品红色地毯
     */
    SOLFERINO_CARPET("SOLFERINO_CARPET"), 171, 2, "textures/blocks/wool_colored_magenta.png"),
    /**
     * 淡蓝色地毯
     */
    LIGHT_BLUE_CARPET("LIGHT_BLUE_CARPET"), 171, 3, "textures/blocks/wool_colored_light_blue.png"),
    /**
     * 黄色地毯
     */
    YELLOW_CARPET("YELLOW_CARPET"), 171, 4, "textures/blocks/wool_colored_yellow.png"),
    /**
     * 黄绿色地毯
     */
    OLIVINE_CARPET("OLIVINE_CARPET"), 171, 5, "textures/blocks/wool_colored_lime.png"),
    /**
     * 粉红色地毯
     */
    PINK_CARPET("PINK_CARPET"), 171, 6, "textures/blocks/wool_colored_pink.png"),
    /**
     * 灰色地毯
     */
    GRAY_CARPET("GRAY_CARPET"), 171, 7, "textures/blocks/wool_colored_gray.png"),
    /**
     * 淡灰色地毯
     */
    LIGHT_GRAY_CARPET("LIGHT_GRAY_CARPET"), 171, 8, "textures/blocks/wool_colored_silver.png"),
    /**
     * 青色地毯
     */
    CYAN_CARPET("CYAN_CARPET"), 171, 9, "textures/blocks/wool_colored_cyan.png"),
    /**
     * 紫色地毯
     */
    VIOLET_CARPET("VIOLET_CARPET"), 171, 10, "textures/blocks/wool_colored_purple.png"),
    /**
     * 蓝色地毯
     */
    BLUE_CARPET("BLUE_CARPET"), 171, 11, "textures/blocks/wool_colored_blue.png"),
    /**
     * 棕色地毯
     */
    BROWN_CARPET("BROWN_CARPET"), 171, 12, "textures/blocks/wool_colored_brown.png"),
    /**
     * 绿色地毯
     */
    GREEN_CARPET("GREEN_CARPET"), 171, 13, "textures/blocks/wool_colored_green.png"),
    /**
     * 红色地毯
     */
    RED_CARPET("RED_CARPET"), 171, 14, "textures/blocks/wool_colored_red.png"),
    /**
     * 黑色地毯
     */
    BLACK_CARPET("BLACK_CARPET"), 171, 15, "textures/blocks/wool_colored_black.png"),
    /**
     * 硬化粘土
     */
    HARDENED_CLAY("HARDENED_CLAY"), 172, 0, "textures/blocks/hardened_clay.png"),
    /**
     * 煤炭块
     */
    COAL_BLOCK("COAL_BLOCK"), 173, 0, "textures/blocks/coal_block.png"),
    /**
     * 浮冰
     */
    PACKED_ICE("PACKED_ICE"), 174, 0, "textures/blocks/ice_packed.png"),
    /**
     * 向日葵
     */
    SUNFLOWER("SUNFLOWER"), 175, 0, "textures/blocks/double_plant_sunflower_front.png"),
    /**
     * 丁香
     */
    LILAC("LILAC"), 175, 1, "textures/blocks/flower_cornflower.png"),
    /**
     * 高草丛
     */
    TALL_GRASS("TALL_GRASS"), 175, 2, "textures/blocks/double_plant_grass_carried.png"),
    /**
     * 大型蕨
     */
    LARGE_FERN("LARGE_FERN"), 175, 3, "textures/blocks/tallgrass.png"),
    /**
     * 玫瑰丛
     */
    ROSE_BUSH("ROSE_BUSH"), 175, 4, "textures/blocks/sweet_berry_bush_stage3.png"),
    /**
     * 牡丹
     */
    PEONY("PEONY"), 175, 5, "textures/blocks/flower_allium.png"),
    /**
     * 旗帜
     */
    STANDING_BANNER("STANDING_BANNER"), 176, 0, "textures/blocks/bone_block_side.png"),
    /**
     * 悬挂的旗帜
     */
    WALL_BANNER("WALL_BANNER"), 177, 0, "textures/blocks/bone_block_side.png"),
    /**
     * 红沙石
     */
    RED_SANDSTONE("RED_SANDSTONE"), 179, 0, "textures/blocks/red_sandstone_bottom.png"),
    /**
     * 錾制红沙石
     */
    CHISELED_RED_SANDSTONE("CHISELED_RED_SANDSTONE"), 179, 1, "textures/blocks/red_sandstone_carved.png"),
    /**
     * 平滑红沙石
     */
    SMOOTH_RED_SANDSTONE("SMOOTH_RED_SANDSTONE"), 179, 2, "textures/blocks/red_sandstone_smooth.png"),
    /**
     * 红沙石阶梯
     */
    RED_SANDSTONE_STAIRS("RED_SANDSTONE_STAIRS"), 180, 0, "textures/blocks/red_sandstone_carved.png"),
    /**
     * 红沙石台阶
     */
    STONE_SLAB2("STONE_SLAB2"), 182, 0, "textures/blocks/red_sandstone_smooth.png"),
    /**
     * 云杉围墙大门
     */
    SPRUCE_FENCE_GATE("SPRUCE_FENCE_GATE"), 183, 0, "textures/blocks/door_spruce_lower.png"),
    /**
     * 桦木围墙大门
     */
    BIRCH_FENCE_GATE("BIRCH_FENCE_GATE"), 184, 0, "textures/blocks/door_birch_upper.png"),
    /**
     * 丛林木围墙大门
     */
    JUNGLE_FENCE_GATE("JUNGLE_FENCE_GATE"), 185, 0, "textures/blocks/door_acacia_upper.png"),
    /**
     * 深色橡木围墙大门
     */
    DARK_OAK_FENCE_GATE("DARK_OAK_FENCE_GATE"), 186, 0, "textures/blocks/door_dark_oak_lower.png"),
    /**
     * 金合欢木围墙大门
     */
    ACACIA_FENCE_GATE("ACACIA_FENCE_GATE"), 187, 0, "textures/blocks/door_spruce_lower.png"),
    /**
     * 重复命令块
     */
    SPRUCE_FENCE("SPRUCE_FENCE"), 188, 0, "textures/blocks/chain_command_block_conditional_mipmap.png"),
    /**
     * 链命令块
     */
    BIRCH_FENCE("BIRCH_FENCE"), 189, 0, "textures/blocks/repeating_command_block_back_mipmap.png"),
    /**
     * 桦木门
     */
    BIRCH_DOOR("BIRCH_DOOR"), 194, 0, "textures/blocks/door_birch_upper.png"),
    /**
     * 绿茵小道
     */
    END_ROD("END_ROD"), 198, 0, "textures/blocks/end_rod.png"),
    /**
     * 合唱花
     */
    CHORUS_FLOWER("CHORUS_FLOWER"), 200, 0, "textures/blocks/chorus_flower.png"),
    /**
     * 紫珀方块
     */
    PURPUR_BLOCK("PURPUR_BLOCK"), 201, 0, "textures/blocks/purpur_block.png"),
    /**
     * 紫珀阶梯
     */
    PURPUR_STAIRS("PURPUR_STAIRS"), 203, 0, "textures/blocks/purpur_block.png"),
    /**
     * 潜匿之贝箱子
     */
    PURPUR_SLAB("PURPUR_SLAB"), 205, 0, "textures/items/shulker_shell.png"),
    /**
     * 末地石砖
     */
    END_BRICKS("END_BRICKS"), 206, 0, "textures/blocks/end_bricks.png"),
    /**
     * 末地棒
     */
    GRASS_PATH("GRASS_PATH"), 208, 0, "textures/blocks/grass_path_side.png"),
    /**
     * 末地门2
     */
    END_GATEWAY("END_GATEWAY"), 209, 0, "textures/blocks/end_gateway.png"),
    /**
     * 铁锹
     */
    IRON_SHOVEL("IRON_SHOVEL"), 256, 0, "textures/items/iron_shovel.png"),
    /**
     * 铁镐
     */
    IRON_PICKAXE("IRON_PICKAXE"), 257, 0, "textures/items/iron_pickaxe.png"),
    /**
     * 铁斧
     */
    IRON_AXE("IRON_AXE"), 258, 0, "textures/items/iron_axe.png"),
    /**
     * 打火石
     */
    FLINT_AND_STEEL("FLINT_AND_STEEL"), 259, 0, "textures/items/flint_and_steel.png"),
    /**
     * 苹果
     */
    APPLE("APPLE"), 260, 0, "textures/items/apple.png"),
    /**
     * 弓
     */
    BOW("BOW"), 261, 0, "textures/items/bow_standby.png"),
    /**
     * 箭
     */
    ARROW("ARROW"), 262, 0, "textures/items/arrow.png"),
    /**
     * 煤炭
     */
    COAL("COAL"), 263, 0, "textures/items/coal.png"),
    /**
     * 木炭
     */
    CHARCOAL("CHARCOAL"), 263, 1, "textures/items/charcoal.png"),
    /**
     * 钻石
     */
    DIAMOND("DIAMOND"), 264, 0, "textures/items/diamond.png"),
    /**
     * 铁锭
     */
    IRON_INGOT("IRON_INGOT"), 265, 0, "textures/items/iron_ingot.png"),
    /**
     * 金锭
     */
    GOLD_INGOT("GOLD_INGOT"), 266, 0, "textures/items/gold_ingot.png"),
    /**
     * 铁剑
     */
    IRON_SWORD("IRON_SWORD"), 267, 0, "textures/items/iron_sword.png"),
    /**
     * 木剑
     */
    WOODEN_SWORD("WOODEN_SWORD"), 268, 0, "textures/items/wood_sword.png"),
    /**
     * 木锹
     */
    WOODEN_SHOVEL("WOODEN_SHOVEL"), 269, 0, "textures/items/wood_shovel.png"),
    /**
     * 木镐
     */
    WOODEN_PICKAXE("WOODEN_PICKAXE"), 270, 0, "textures/items/wood_pickaxe.png"),
    /**
     * 木斧
     */
    WOODEN_AXE("WOODEN_AXE"), 271, 0, "textures/items/wood_axe.png"),
    /**
     * 石剑
     */
    STONE_SWORD("STONE_SWORD"), 272, 0, "textures/items/stone_sword.png"),
    /**
     * 石锹
     */
    STONE_SHOVEL("STONE_SHOVEL"), 273, 0, "textures/items/stone_shovel.png"),
    /**
     * 石镐
     */
    STONE_PICKAXE("STONE_PICKAXE"), 274, 0, "textures/items/stone_pickaxe.png"),
    /**
     * 石斧
     */
    STONE_AXE("STONE_AXE"), 275, 0, "textures/items/stone_axe.png"),
    /**
     * 钻石剑
     */
    DIAMOND_SWORD("DIAMOND_SWORD"), 276, 0, "textures/items/diamond_sword.png"),
    /**
     * 钻石锹
     */
    DIAMOND_SHOVEL("DIAMOND_SHOVEL"), 277, 0, "textures/items/diamond_shovel.png"),
    /**
     * 钻石镐
     */
    DIAMOND_PICKAXE("DIAMOND_PICKAXE"), 278, 0, "textures/items/diamond_pickaxe.png"),
    /**
     * 钻石斧
     */
    DIAMOND_AXE("DIAMOND_AXE"), 279, 0, "textures/items/diamond_axe.png"),
    /**
     * 木棍
     */
    STICK("STICK"), 280, 0, "textures/items/stick.png"),
    /**
     * 碗
     */
    BOWL("BOWL"), 281, 0, "textures/items/bowl.png"),
    /**
     * 蘑菇煲
     */
    MUSHROOM_STEW("MUSHROOM_STEW"), 282, 0, "textures/items/mushroom_stew.png"),
    /**
     * 金剑
     */
    GOLDEN_SWORD("GOLDEN_SWORD"), 283, 0, "textures/items/gold_sword.png"),
    /**
     * 金锹
     */
    GOLDEN_SHOVEL("GOLDEN_SHOVEL"), 284, 0, "textures/items/gold_shovel.png"),
    /**
     * 金镐
     */
    GOLDEN_PICKAXE("GOLDEN_PICKAXE"), 285, 0, "textures/items/gold_pickaxe.png"),
    /**
     * 金斧
     */
    GOLDEN_AXE("GOLDEN_AXE"), 286, 0, "textures/items/gold_axe.png"),
    /**
     * 蛛丝
     */
    STRING("STRING"), 287, 0, "textures/items/string.png"),
    /**
     * 羽毛
     */
    FEATHER("FEATHER"), 288, 0, "textures/items/feather.png"),
    /**
     * 火药
     */
    GUNPOWDER("GUNPOWDER"), 289, 0, "textures/items/gunpowder.png"),
    /**
     * 木锄
     */
    WOODEN_HOE("WOODEN_HOE"), 290, 0, "textures/items/wood_hoe.png"),
    /**
     * 石锄
     */
    STONE_HOE("STONE_HOE"), 291, 0, "textures/items/stone_hoe.png"),
    /**
     * 铁锄
     */
    IRON_HOE("IRON_HOE"), 292, 0, "textures/items/iron_hoe.png"),
    /**
     * 钻石锄
     */
    DIAMOND_HOE("DIAMOND_HOE"), 293, 0, "textures/items/diamond_hoe.png"),
    /**
     * 金锄
     */
    GOLDEN_HOE("GOLDEN_HOE"), 294, 0, "textures/items/gold_hoe.png"),
    /**
     * 种子
     */
    WHEAT_SEEDS("WHEAT_SEEDS"), 295, 0, "textures/items/seeds_wheat.png"),
    /**
     * 小麦
     */
    WHEAT("WHEAT"), 296, 0, "textures/items/wheat.png"),
    /**
     * 面包
     */
    BREAD("BREAD"), 297, 0, "textures/items/bread.png"),
    /**
     * 皮革头盔
     */
    LEATHER_HELMET("LEATHER_HELMET"), 298, 0, "textures/items/leather_helmet.tga"),
    /**
     * 皮革胸甲
     */
    LEATHER_CHESTPLATE("LEATHER_CHESTPLATE"), 299, 0, "textures/items/leather_chestplate.png"),
    /**
     * 皮革护腿
     */
    LEATHER_LEGGINGS("LEATHER_LEGGINGS"), 300, 0, "textures/items/leather_leggings.tga"),
    /**
     * 皮革靴子
     */
    LEATHER_BOOTS("LEATHER_BOOTS"), 301, 0, "textures/items/leather_boots.tga"),
    /**
     * 锁链头盔
     */
    CHAINMAIL_HELMET("CHAINMAIL_HELMET"), 302, 0, "textures/items/chainmail_helmet.png"),
    /**
     * 锁链胸甲
     */
    CHAINMAIL_CHESTPLATE("CHAINMAIL_CHESTPLATE"), 303, 0, "textures/items/chainmail_chestplate.png"),
    /**
     * 锁链护腿
     */
    CHAINMAIL_LEGGINGS("CHAINMAIL_LEGGINGS"), 304, 0, "textures/items/chainmail_leggings.png"),
    /**
     * 锁链靴子
     */
    CHAINMAIL_BOOTS("CHAINMAIL_BOOTS"), 305, 0, "textures/items/chainmail_boots.png"),
    /**
     * 铁头盔
     */
    IRON_HELMET("IRON_HELMET"), 306, 0, "textures/items/iron_helmet.png"),
    /**
     * 铁胸甲
     */
    IRON_CHESTPLATE("IRON_CHESTPLATE"), 307, 0, "textures/items/iron_chestplate.png"),
    /**
     * 铁护腿
     */
    IRON_LEGGINGS("IRON_LEGGINGS"), 308, 0, "textures/items/iron_leggings.png"),
    /**
     * 铁靴子
     */
    IRON_BOOTS("IRON_BOOTS"), 309, 0, "textures/items/iron_boots.png"),
    /**
     * 钻石头盔
     */
    DIAMOND_HELMET("DIAMOND_HELMET"), 310, 0, "textures/items/diamond_helmet.png"),
    /**
     * 钻石胸甲
     */
    DIAMOND_CHESTPLATE("DIAMOND_CHESTPLATE"), 311, 0, "textures/items/diamond_chestplate.png"),
    /**
     * 钻石护腿
     */
    DIAMOND_LEGGINGS("DIAMOND_LEGGINGS"), 312, 0, "textures/items/diamond_leggings.png"),
    /**
     * 钻石靴子
     */
    DIAMOND_BOOTS("DIAMOND_BOOTS"), 313, 0, "textures/items/diamond_boots.png"),
    /**
     * 金头盔
     */
    GOLDEN_HELMET("GOLDEN_HELMET"), 314, 0, "textures/items/gold_helmet.png"),
    /**
     * 金胸甲
     */
    GOLDEN_CHESTPLATE("GOLDEN_CHESTPLATE"), 315, 0, "textures/items/gold_chestplate.png"),
    /**
     * 金护腿
     */
    GOLDEN_LEGGINGS("GOLDEN_LEGGINGS"), 316, 0, "textures/items/gold_leggings.png"),
    /**
     * 金靴子
     */
    GOLDEN_BOOTS("GOLDEN_BOOTS"), 317, 0, "textures/items/gold_boots.png"),
    /**
     * 燧石
     */
    FLINT("FLINT"), 318, 0, "textures/items/flint.png"),
    /**
     * 生猪排
     */
    PORKCHOP("PORKCHOP"), 319, 0, "textures/items/porkchop_raw.png"),
    /**
     * 熟猪排
     */
    COOKED_PORKCHOP("COOKED_PORKCHOP"), 320, 0, "textures/items/porkchop_cooked.png"),
    /**
     * 画
     */
    PAINTING("PAINTING"), 321, 0, "textures/items/painting.png"),
    /**
     * 金苹果
     */
    GOLDEN_APPLE("GOLDEN_APPLE"), 322, 0, "textures/items/apple_golden.png"),
    /**
     * 告示牌
     */
    SIGN("SIGN"), 323, 0, "textures/items/sign.png"),
    /**
     * 橡木门
     */
    WOODEN_DOOR("WOODEN_DOOR"), 324, 0, "textures/items/door_wood.png"),
    /**
     * 桶
     */
    BUCKET("BUCKET"), 325, 0, "textures/items/bucket_empty.png"),
    /**
     * 矿车
     */
    MINECART("MINECART"), 328, 0, "textures/items/minecart_normal.png"),
    /**
     * 鞍
     */
    SADDLE("SADDLE"), 329, 0, "textures/items/saddle.png"),
    /**
     * 红石
     */
    REDSTONE("REDSTONE"), 331, 0, "textures/items/redstone_dust.png"),
    /**
     * 雪球
     */
    SNOWBALL("SNOWBALL"), 332, 0, "textures/items/snowball.png"),
    /**
     * 橡木船
     */
    BOAT("BOAT"), 333, 0, "textures/items/boat.png"),
    /**
     * 皮革
     */
    LEATHER("LEATHER"), 334, 0, "textures/items/leather.png"),
    /**
     * 粘土球
     */
    CLAY_BALL("CLAY_BALL"), 337, 0, "textures/items/clay_ball.png"),
    /**
     * 甘蔗
     */
    REEDS("REEDS"), 338, 0, "textures/items/reeds.png"),
    /**
     * 纸
     */
    PAPER("PAPER"), 339, 0, "textures/items/paper.png"),
    /**
     * 书
     */
    BOOK("BOOK"), 340, 0, "textures/items/book_normal.png"),
    /**
     * 粘液球
     */
    SLIME_BALL("SLIME_BALL"), 341, 0, "textures/items/slimeball.png"),
    /**
     * 箱子矿车
     */
    CHEST_MINECART("CHEST_MINECART"), 342, 0, "textures/items/minecart_chest.png"),
    /**
     * 鸡蛋
     */
    EGG("EGG"), 344, 0, "textures/items/egg.png"),
    /**
     * 指南针
     */
    COMPASS("COMPASS"), 345, 0, "textures/items/compass_item.png"),
    /**
     * 鱼竿
     */
    FISHING_ROD("FISHING_ROD"), 346, 0, "textures/items/fishing_rod_cast.png"),
    /**
     * 时钟
     */
    CLOCK("CLOCK"), 347, 0, "textures/items/clock_item.png"),
    /**
     * 荧石粉
     */
    GLOWSTONE_DUST("GLOWSTONE_DUST"), 348, 0, "textures/items/glowstone_dust.png"),
    /**
     * 鱼
     */
    FISH("FISH"), 349, 0, "textures/items/fish_raw.png"),
    /**
     * 熟鱼
     */
    COOKED_FISH("COOKED_FISH"), 350, 0, "textures/items/fish_cooked.png"),
    /**
     * 墨囊
     */
    DYE("DYE"), 351, 0, "textures/items/dye_powder_black.png"),
    /**
     * 品红色染料
     */
    SOLFERINO_DYE("SOLFERINO_DYE"), 351, 1, "textures/items/dye_powder_purple.png"),
    /**
     * 绿色染料
     */
    GREEN_DYE("GREEN_DYE"), 351, 2, "textures/items/dye_powder_green.png"),
    /**
     * 可可豆
     */
    BROWN_DYE("BROWN_DYE"), 351, 3, "textures/items/dye_powder_brown.png"),
    /**
     * 蓝色染料
     */
    BLUE_DYE("BLUE_DYE"), 351, 4, "textures/items/dye_powder_blue.png"),
    /**
     * 紫色染料
     */
    VIOLET_DYE("VIOLET_DYE"), 351, 5, "textures/items/dye_powder_purple.png"),
    /**
     * 青色染料
     */
    CYAN_DYE("CYAN_DYE"), 351, 6, "textures/items/dye_powder_cyan.png"),
    /**
     * 淡灰色染料
     */
    LIGHT_GRAY_DYE("LIGHT_GRAY_DYE"), 351, 7, "textures/items/dye_powder_silver.png"),
    /**
     * 灰色染料
     */
    GRAY_DYE("GRAY_DYE"), 351, 8, "textures/items/dye_powder_pink.png"),
    /**
     * 粉红色染料
     */
    PINK_DYE("PINK_DYE"), 351, 9, "textures/items/dye_powder_pink.png"),
    /**
     * 黄绿色染料
     */
    OLIVINE_DYE("OLIVINE_DYE"), 351, 10, "textures/items/dye_powder_lime.png"),
    /**
     * 黄色染料
     */
    YELLOW_DYE("YELLOW_DYE"), 351, 11, "textures/items/dye_powder_yellow.png"),
    /**
     * 淡蓝色染料
     */
    LIGHT_BLUE_DYE("LIGHT_BLUE_DYE"), 351, 12, "textures/items/dye_powder_light_blue.png"),
    /**
     * 红色染料
     */
    RED_DYE("RED_DYE"), 351, 13, "textures/items/dye_powder_red.png"),
    /**
     * 橙色染料
     */
    ORANGE_DYE("ORANGE_DYE"), 351, 14, "textures/items/dye_powder_orange.png"),
    /**
     * 骨粉
     */
    WHITE_DYE("WHITE_DYE"), 351, 15, "textures/items/dye_powder_white.png"),
    /**
     * 骨头
     */
    BONE("BONE"), 352, 0, "textures/items/bone.png"),
    /**
     * 糖
     */
    SUGAR("SUGAR"), 353, 0, "textures/items/sugar.png"),
    /**
     * 蛋糕
     */
    CAKE("CAKE"), 354, 0, "textures/items/cake.png"),
    /**
     * 床
     */
    BED("BED"), 355, 0, "textures/items/bed_red.png"),
    /**
     * 中继器
     */
    REPEATER("REPEATER"), 356, 0, "textures/items/repeater.png"),
    /**
     * 曲奇
     */
    COOKIE("COOKIE"), 357, 0, "textures/items/cookie.png"),
    /**
     * 地图(满)
     */
    FILLED_MAP("FILLED_MAP"), 358, 0, "textures/items/map_nautilus.png"),
    /**
     * 剪刀
     */
    SHEARS("SHEARS"), 359, 0, "textures/items/shears.png"),
    /**
     * 西瓜
     */
    MELON("MELON"), 360, 0, "textures/items/melon.png"),
    /**
     * 南瓜种子
     */
    MELON_SEEDS("MELON_SEEDS"), 362, 0, "textures/items/seeds_melon.png"),
    /**
     * 生牛肉
     */
    BEEF("BEEF"), 363, 0, "textures/items/beef_raw.png"),
    /**
     * 熟牛肉
     */
    COOKED_BEEF("COOKED_BEEF"), 364, 0, "textures/items/beef_cooked.png"),
    /**
     * 生鸡肉
     */
    CHICKEN("CHICKEN"), 365, 0, "textures/items/chicken_raw.png"),
    /**
     * 熟鸡肉
     */
    COOKED_CHICKEN("COOKED_CHICKEN"), 366, 0, "textures/items/chicken_cooked.png"),
    /**
     * 腐肉
     */
    ROTTEN_FLESH("ROTTEN_FLESH"), 367, 0, "textures/items/rotten_flesh.png"),
    /**
     * 末影珍珠
     */
    ENDER_PEARL("ENDER_PEARL"), 368, 0, "textures/items/ender_pearl.png"),
    /**
     * 烈焰棒
     */
    BLAZE_ROD("BLAZE_ROD"), 369, 0, "textures/items/blaze_rod.png"),
    /**
     * 恶魂泪
     */
    GHAST_TEAR("GHAST_TEAR"), 370, 0, "textures/items/ghast_tear.png"),
    /**
     * 金粒
     */
    GOLD_NUGGET("GOLD_NUGGET"), 371, 0, "textures/items/gold_nugget.png"),
    /**
     * 地狱疣
     */
    NETHER_WART("NETHER_WART"), 372, 0, "textures/items/nether_wart.png"),
    /**
     * 水瓶
     */
    POTION("POTION"), 373, 0, "textures/items/potion_bottle_drinkable.png"),
    /**
     * 玻璃瓶
     */
    GLASS_BOTTLE("GLASS_BOTTLE"), 374, 0, "textures/items/potion_bottle_empty.png"),
    /**
     * 蜘蛛眼
     */
    SPIDER_EYE("SPIDER_EYE"), 375, 0, "textures/items/spider_eye.png"),
    /**
     * 发酵蜘蛛眼
     */
    SPIDER_EYE_FERMENTED("SPIDER_EYE_FERMENTED"), 376, 0, "textures/items/spider_eye_fermented.png"),
    /**
     * 烈焰粉
     */
    BLAZE_POWDER("BLAZE_POWDER"), 377, 0, "textures/items/blaze_powder.png"),
    /**
     * 岩浆膏
     */
    MAGMA_CREAM("MAGMA_CREAM"), 378, 0, "textures/items/magma_cream.png"),
    /**
     * 末影之眼
     */
    ENDER_EYE("ENDER_EYE"), 381, 0, "textures/items/ender_eye.png"),
    /**
     * 金西瓜
     */
    SPECKLED_MELON("SPECKLED_MELON"), 382, 0, "textures/items/melon_speckled.png"),
    /**
     * 经验瓶
     */
    EXPERIENCE_BOTTLE("EXPERIENCE_BOTTLE"), 384, 0, "textures/items/experience_bottle.png"),
    /**
     * 火球
     */
    FIRE_CHARGE("FIRE_CHARGE"), 385, 0, "textures/items/fireball.png"),
    /**
     * 绿宝石
     */
    EMERALD("EMERALD"), 388, 0, "textures/items/emerald.png"),
    /**
     * 展示框
     */
    ITEM_FRAME("ITEM_FRAME"), 389, 0, "textures/items/item_frame.png"),
    /**
     * 花盆
     */
    FLOWER_POT("FLOWER_POT"), 390, 0, "textures/items/flower_pot.png"),
    /**
     * 胡萝卜
     */
    CARROT("CARROT"), 391, 0, "textures/items/carrot.png"),
    /**
     * 马铃薯
     */
    POTATO("POTATO"), 392, 0, "textures/items/potato.png"),
    /**
     * 烤马铃薯
     */
    BAKED_POTATO("BAKED_POTATO"), 393, 0, "textures/items/potato_baked.png"),
    /**
     * 毒马铃薯
     */
    POISONOUS_POTATO("POISONOUS_POTATO"), 394, 0, "textures/items/potato_poisonous.png"),
    /**
     * 空地图
     */
    MAP("MAP"), 395, 0, "textures/items/map_empty.png"),
    /**
     * 金胡萝卜
     */
    GOLDEN_CARROT("GOLDEN_CARROT"), 396, 0, "textures/items/carrot_golden.png"),
    /**
     * 骷髅头
     */
    SKELETON_SKULL("SKELETON_SKULL"), 397, 0, "textures/items/bone.png"),
    /**
     * 凋零骷髅头
     */
    LEIERDA_SKULL("LEIERDA_SKULL"), 397, 1, "textures/blocks/observer_front.png"),
    /**
     * 僵尸头
     */
    ZOMBIE_SKULL("ZOMBIE_SKULL"), 397, 2, "textures/blocks/observer_front.png"),
    /**
     * 史蒂夫头
     */
    STEVE_SKULL("STEVE_SKULL"), 397, 3, "textures/blocks/observer_front.png"),
    /**
     * 苦力怕头
     */
    CREEPER_SKULL("CREEPER_SKULL"), 397, 4, "textures/blocks/observer_front.png"),
    /**
     * 龙头
     */
    DRAGON_SKULL("DRAGON_SKULL"), 397, 5, "textures/blocks/observer_front.png"),
    /**
     * 胡萝卜杆
     */
    CARROT_ON_A_STICK("CARROT_ON_A_STICK"), 398, 0, "textures/items/carrot_on_a_stick.png"),
    /**
     * 下届之星
     */
    NETHER_STAR("NETHER_STAR"), 399, 0, "textures/items/nether_star.png"),
    /**
     * 南瓜派
     */
    PUMPKIN_PIE("PUMPKIN_PIE"), 400, 0, "textures/items/pumpkin_pie.png"),
    /**
     * 附魔书
     */
    ENCHANTED_BOOK("ENCHANTED_BOOK"), 403, 0, "textures/items/book_writable.png"),
    /**
     * 比较器
     */
    COMPARATOR("COMPARATOR"), 404, 0, "textures/items/comparator.png"),
    /**
     * 地狱石英
     */
    QUARTZ("QUARTZ"), 406, 0, "textures/items/quartz.png"),
    /**
     * tnt矿车
     */
    TNT_MINECART("TNT_MINECART"), 407, 0, "textures/items/minecart_tnt.png"),
    /**
     * 漏斗矿车
     */
    HOPPER_MINECART("HOPPER_MINECART"), 408, 0, "textures/items/minecart_hopper.png"),
    /**
     * 海晶碎片
     */
    PRISMARINE_SHARD("PRISMARINE_SHARD"), 409, 0, "textures/items/prismarine_shard.png"),
    /**
     * 海晶灯粉
     */
    PRISMARINE_CRYSTALS("PRISMARINE_CRYSTALS"), 410, 0, "textures/items/prismarine_crystals.png"),
    /**
     * 生兔子肉
     */
    RABBIT("RABBIT"), 411, 0, "textures/items/rabbit_raw.png"),
    /**
     * 熟兔子肉
     */
    COOKED_RABBIT("COOKED_RABBIT"), 412, 0, "textures/items/rabbit_cooked.png"),
    /**
     * 兔子煲
     */
    RABBIT_STEW("RABBIT_STEW"), 413, 0, "textures/items/rabbit_stew.png"),
    /**
     * 兔子脚
     */
    RABBIT_FOOT("RABBIT_FOOT"), 414, 0, "textures/items/rabbit_foot.png"),
    /**
     * 兔子皮
     */
    RABBIT_HIDE("RABBIT_HIDE"), 415, 0, "textures/items/rabbit_hide.png"),
    /**
     * 皮革马鞍
     */
    ARMOR_STAND("ARMOR_STAND"), 416, 0, "textures/items/saddle.png"),
    /**
     * 铁马鞍
     */
    IRON_HORSE_ARMOR("IRON_HORSE_ARMOR"), 417, 0, "textures/items/iron_horse_armor.png"),
    /**
     * 金马鞍
     */
    GOLD_HORSE_ARMOR("GOLD_HORSE_ARMOR"), 418, 0, "textures/items/gold_horse_armor.png"),
    /**
     * 钻石马鞍
     */
    DIAMOND_HORSE_ARMOR("DIAMOND_HORSE_ARMOR"), 419, 0, "textures/items/diamond_horse_armor.png"),
    /**
     * 栓绳
     */
    LEAD("LEAD"), 420, 0, "textures/items/lead.png"),
    /**
     * 命名牌
     */
    NAME_TAG("NAME_TAG"), 421, 0, "textures/items/name_tag.png"),
    /**
     * 命令方块矿车
     */
    COMMAND_BLOCK_MINECART("COMMAND_BLOCK_MINECART"), 422, 0, "textures/items/minecart_command_block.png"),
    /**
     * 生羊肉
     */
    MUTTON("MUTTON"), 423, 0, "textures/items/mutton_raw.png"),
    /**
     * 熟羊肉
     */
    COOKED_MUTTON("COOKED_MUTTON"), 424, 0, "textures/items/mutton_cooked.png"),
    /**
     * 云杉木门
     */
    SPRUCE_DOOR("SPRUCE_DOOR"), 427, 0, "textures/items/door_jungle.png"),
    /**
     * 桦树木门
     */
    BIRCH_WOOD_DOOR("BIRCH_WOOD_DOOR"), 428, 0, "textures/items/door_birch.png"),
    /**
     * 丛林木门
     */
    JUNGLE_DOOR("JUNGLE_DOOR"), 429, 0, "textures/items/door_spruce.png"),
    /**
     * 金合欢木门
     */
    ACACIA_DOOR("ACACIA_DOOR"), 430, 0, "textures/items/door_acacia.png"),
    /**
     * 深色橡木门
     */
    DARK_OAK_DOOR("DARK_OAK_DOOR"), 431, 0, "textures/items/door_dark_oak.png"),
    /**
     * 共鸣果
     */
    CHORUS_FRUIT("CHORUS_FRUIT"), 432, 0, "textures/items/chorus_fruit.png"),
    /**
     * 爆裂共鸣果
     */
    POPPED_CHORUS_FRUIT("POPPED_CHORUS_FRUIT"), 433, 0, "textures/items/chorus_fruit_popped.png"),
    /**
     * 龙息
     */
    DRAGON_BREATH("DRAGON_BREATH"), 437, 0, "textures/items/dragons_breath.png"),
    /**
     * 喷溅的水瓶
     */
    SPLASH_POTION("SPLASH_POTION"), 438, 0, "textures/items/potion_bottle_splash.png"),
    /**
     * 遗留的水瓶
     */
    LINGERING_POTION("LINGERING_POTION"), 441, 0, "textures/items/potion_bottle_lingering_waterBreathing.png"),
    /**
     * 翅鞘
     */
    ELYTRA("ELYTRA"), 444, 0, "textures/items/elytra.png"),
    /**
     * 潜匿之壳
     */
    BIRCH_BOAT("BIRCH_BOAT"), 445, 0, "textures/items/shulker_shell.png"),
    /**
     * 鸡刷怪蛋
     */
    SPAWN_MOB("SPAWN_MOB"), 383, 10, "textures/items/egg_chicken.png"),
    /**
     * 末影水晶
     * */
    END_CRYSTAL("END_CRYSTAL",426,0,"textures/items/end_crystal.png");

    private int ID, Damage;
    private String Name, Path;
    private static final HashMap<String, Map<String, Object>> NAME_MAP = new HashMap<>();
    private static final HashMap<String, Map<String, Object>> ID_MAP = new HashMap<>();
    private static final HashMap<String, ItemIDSunName> ItemIDSunName_MAP = new HashMap<>();
    private static final ArrayList<HashMap<String, Object>> All = new ArrayList<>();
    static {
        for (ItemIDSunName item : ItemIDSunName.values()) {
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("ID", item.ID);
            map.put("Damage", item.Damage);
            map.put("Path", item.Path);
            map.put("Name", item.Name);
            map.put("item", item);
            All.add(map);
            NAME_MAP.put(item.Name, map);
            ID_MAP.put(item.ID + ":" + item.Damage, map);
            ItemIDSunName_MAP.put(item.ID + ":" + item.Damage, item);
        }
    }

    /**
     * @param Name   物品名称
     * @param id     物品ID
     * @param Damage 物品特殊值
     * @param Path   物品贴图路径
     */
    private ItemIDSunName(String Name, int id, int Damage, String Path) {
        this.ID = id;
        this.Name = Name;
        this.Damage = Damage;
        this.Path = Path;
    }

    /**
     * @return 物品贴图路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * @return 物品名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * @return 物品特殊值
     */
    public int getDamage() {
        return this.Damage;
    }

    /**
     * @return 物品ID
     */
    public int getID() {
        return this.ID;
    }

    /**
     * @param ID 物品ID
     * @return 根据物品ID获取物品贴图路径
     */
    public static String getIDByPath(int ID) {
        return getIDByPath(ID + ":0");
    }

    /**
     * @param ID     物品ID
     * @param Damage 物品特殊值
     * @return 根据物品ID获取物品贴图路径
     */
    public static String getIDByPath(int ID, int Damage) {
        return getIDByPath(ID + ":" + Damage);
    }

    /**
     * @param ID 物品ID（ID：特殊值）
     * @return 根据物品ID获取物品贴图路径（ID：特殊值）
     */
    public static String getIDByPath(String ID) {
        Map<String, Object> map = ID_MAP.getOrDefault(ID, null);
        if (map == null || map.getOrDefault("Path", null) == null)
            return null;
        return String.valueOf(map.get("Path"));
    }

    /**
     * @param ID 物品ID
     * @return 根据物品ID获取物品名称
     */
    public static String getIDByName(int ID) {
        return getIDByName(ID + ":0");
    }

    /**
     * @param ID     物品ID
     * @param Damage 物品特殊值
     * @return 根据物品ID获取物品名称
     */
    public static String getIDByName(int ID, int Damage) {
        return getIDByName(ID + ":" + Damage);
    }


    public static String getIDByName(Item item) {
        String name = getIDByName(item.getId() + ":" + item.getDamage());
        if(name == null){
            if(item.hasCustomName()){
                return item.getCustomName();
            }else{
                return item.getName();
            }
        }else{
            if(item.hasCustomName()) {
                return item.getCustomName();
            }
            return name;
        }
    }

    /**
     * @param ID 物品ID（ID：特殊值）
     * @return 根据物品ID获取物品名称
     */
    public static String getIDByName(String ID) {
        Map<String, Object> map = ID_MAP.getOrDefault(ID, null);
        if (map == null || map.getOrDefault("Name", null) == null)
            return null;
        return String.valueOf(map.get("Name"));
    }

    /**
     * @param Name 物品名称
     * @return 根据物品名称获取物品ID
     */
    public static int getNameByID(String Name) {
        Map<String, Object> map = NAME_MAP.getOrDefault(Name, null);
        if (map == null || map.getOrDefault("ID", null) == null)
            return 0;
        return Integer.valueOf(String.valueOf(map.get("ID")));
    }

    /**
     * @param Name 物品名称
     * @return 根据物品名称获取物品特殊值
     */
    public static int getNameByDamage(String Name) {
        Map<String, Object> map = NAME_MAP.getOrDefault(Name, null);
        if (map == null || map.getOrDefault("Damage", null) == null)
            return 0;
        return Integer.valueOf(String.valueOf(map.get("Damage")));
    }

    /**
     * @param Name 物品名称
     * @return 根据物品名称获取物品贴图路径
     */
    public static String getNameByPath(String Name) {
        Map<String, Object> map = NAME_MAP.getOrDefault(Name, null);
        if (map == null || map.getOrDefault("Path", null) == null)
            return null;
        return String.valueOf(map.get("Path"));
    }

    /**
     * @param ID 物品ID
     * @return 根据物品ID获取物品枚举对象
     */
    public static ItemIDSunName getItem(int ID) {
        return getItem(ID, 0);
    }

    /**
     * @param ID     物品ID
     * @param Damage 物品特殊值
     * @return 根据物品ID获取物品枚举对象
     */
    public static ItemIDSunName getItem(int ID, int Damage) {
        return ItemIDSunName_MAP.getOrDefault(ID + ":" + Damage, null);
    }

    /**
     * @param Name 物品名称
     * @return 根据物品ID获取物品枚举对象
     */
    public static ItemIDSunName getItem(String Name) {
        return getItem(getNameByID(Name), getNameByDamage(Name));
    }

    /**
     * @param ID（ID：特殊值）/物品名称
     * @return 尝试解析冰获取物品ID（ID：特殊值）
     */
    public static String UnknownToID(String ID) {
        if (!ID.contains(":")) {
            if (getNameByPath(ID) != null)
                return getNameByID(ID) + ":" + getNameByDamage(ID);
            else if (getIDByPath(ID + ":0") != null)
                return ID + ":0";
            else
                return ID;
        } else {
            if (getIDByPath(ID) != null)
                return ID;
            else if (getNameByPath(ID) != null)
                return getNameByID(ID) + ":" + getNameByDamage(ID);
            else
                return ID;
        }
    }

    /**
     * @param string 物品ID/物品名称/物品贴图路径
     * @return 尝试解析并获取物品贴图路径
     */
    public static String UnknownToPath(String string) {
        if (UnknownToID(string) != null)
            return getIDByPath(UnknownToID(string));
        else
            return string;
    }


    /**
     * 获取所有项目
     *
     * @return
     */
    public static ArrayList<HashMap<String, Object>> getAll() {
        return All;
    }
}