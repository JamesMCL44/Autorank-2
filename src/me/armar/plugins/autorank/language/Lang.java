package me.armar.plugins.autorank.language;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;

/**
 * Every enumeration value has its path and default value. To get the path, do
 * {@link #getPath()}. To get the default value, do {@link #getDefault()}.
 * <p>
 * For the defined value in the lang.yml config, use
 * {@link #getConfigValue(Object... args)}. String objects are expected as
 * input.
 *
 * @author Staartvin and gomeow
 */

public enum Lang {
    /**
     * Obtain at least {0} advancements
     */
    ADVANCEMENT_MULTIPLE_REQUIREMENT("advancement-multiple-requirement", "Obtain at least {0} advancements"),
    /**
     * Obtain Advancement '{0}'
     */
    ADVANCEMENT_SINGLE_REQUIREMENT("advancement-single-requirement", "Obtain Advancement '{0}'"),
    /**
     * Have at least an (acid) island level of {0}.
     */
    ACID_ISLAND_LEVEL_REQUIREMENT("acid-island-level-requirement", "Have at least an (acid) island level of {0}."),
    /**
     * but has already completed this path before.
     */
    ALREADY_COMPLETED_PATH("already-completed-path", "but has already completed this path before."),
    /**
     * &cYou have already completed this requirement!
     */
    ALREADY_COMPLETED_REQUIREMENT("already-completed-requirement", "&cYou have already completed this requirement!"),
    /**
     * &cYou're already on this path!
     */
    ALREADY_ON_THIS_PATH("already-on-this-path", "&cYou're already on this path!"),
    /**
     * and
     */
    AND("and", "and"),
    /**
     * &a----------- [Times of &6{0}&a] -----------
     */
    AR_TIMES_HEADER("ar-times-header", "&a----------- [Times of &6{0}&a] -----------"),
    /**
     * &6{0}&9 played:
     */
    AR_TIMES_PLAYER_PLAYED("ar-times-player-played", "&6{0}&9 played:"),
    /**
     * &eThis month: &d
     */
    AR_TIMES_THIS_MONTH("ar-times-this-month", "&eThis month: &d{0}"),
    /**
     * &cThis week: &d
     */
    AR_TIMES_THIS_WEEK("ar-times-this-week", "&cThis week: &d{0}"),
    /**
     * &3Today: &d
     */
    AR_TIMES_TODAY("ar-times-today", "&3Today: &d{0}"),
    /**
     * &aTotal: &d
     */
    AR_TIMES_TOTAL("ar-times-total", "&aTotal: &d{0}"),
    /**
     * Have at least an (skyblock) island level of {0}.
     */
    ASKYBLOCK_LEVEL_REQUIREMENT("askyblock-level-requirement", "Have at least an (skyblock) island level of {0}."),
    /**
     * &3Autorank's files have been reloaded.
     */
    AUTORANK_RELOADED("autorank-reloaded", "&3Autorank's files have been reloaded."),
    /**
     * Travel at least {0} {1}.
     */
    BLOCKS_MOVED_REQUIREMENT("blocks-moved-requirement", "Travel at least {0} {1}"),
    /**
     * Break at least {0}.
     */
    BROKEN_BLOCKS_REQUIREMENT("broken-blocks-requirement", "Break at least {0}"),
    /**
     * &cCannot check for console!
     */
    CANNOT_CHECK_CONSOLE("cannot-check-console", "&cCannot check for console!"),
    /**
     * &2You have chosen &7'{0}'&2.
     */
    CHOSEN_PATH("chosen-path", "&2You have chosen &7'{0}'&2."),
    /**
     * Perform the following command: {0}
     */
    COMMAND_RESULT("command-result", "Perform the following command(s): {0}"),
    /**
     * Take at least {0} damage
     */
    DAMAGE_TAKEN_REQUIREMENT("damage-taken-requirement", "Take at least {0} damage"),
    /**
     * New storage has been imported!
     */
    DATA_IMPORTED("storage-imported", "New storage has been imported!"),
    /**
     * days
     */
    DAY_PLURAL("day-plural", "days"),
    /**
     * day
     */
    DAY_SINGULAR("day-singular", "day"),
    /**
     * You do not meet requirements for #&6{0}&c:
     */
    DO_NOT_MEET_REQUIREMENTS_FOR("do-not-meet-requirements-for", "You do not meet requirements for #&6{0}&c:"),

    /**
     * You do not meet requirements for #&6{0}&c:
     */
    DO_NOT_MEET_REQUIREMENTS_CURRENT("do-not-meet-requirements-current", "Current: &6{0}"),

    /**
     * Done
     */
    DONE_MARKER("done-marker", "Done"),
    /**
     * Play {0} effect on you.
     */
    EFFECT_RESULT("effect-result", "Play '{0}' effect on you."),
    /**
     * Be from area '{0}'.
     */
    ESSENTIALS_GEOIP_LOCATION_REQUIREMENT("essentials-geoip-location-requirement", "Be from area {0}"),
    /**
     * Have at least level {0} in exp.
     */
    EXP_REQUIREMENT("exp-requirement", "Have at least level {0} in exp"),
    /**
     * Have at least {0} power in your faction.
     */
    FACTIONS_POWER_REQUIREMENT("factions-power-requirement", "Have at least {0} power in your faction"),
    /**
     * Catch at least {0} fish.
     */
    FISH_CAUGHT_REQUIREMENT("fish-caught-requirement", "Catch at least {0} fish"),
    /**
     * Eat at least '{0}'.
     */
    FOOD_EATEN_REQUIREMENT("food-eaten-requirement", "Eat at least {0}"),
    /**
     * Be in gamemode {0}.
     */
    GAMEMODE_REQUIREMENT("gamemode-requirement", "Be in gamemode {0}"),
    /**
     * Play for at least {0} on any of the servers.
     */
    GLOBAL_TIME_REQUIREMENT("global-time-requirement", "Play for at least {0} on any of the servers"),
    /**
     * Have at least {0} bonus blocks in GriefPrevention
     */
    GRIEF_PREVENTION_BONUS_BLOCKS_REQUIREMENT("grief-prevention-bonus-blocks-requirement", "Have at least {0} bonus blocks in GriefPrevention"),
    /**
     * Have at least {0} claimed blocks in GriefPrevention
     */
    GRIEF_PREVENTION_CLAIMED_BLOCKS_REQUIREMENT("grief-prevention-claimed-blocks-requirement", "Have at least {0} claimed blocks in GriefPrevention"),
    /**
     * Have at least {0} claims in GriefPrevention
     */
    GRIEF_PREVENTION_CLAIMS_COUNT_REQUIREMENT("grief-prevention-claims-count-requirement", "Have at least {0} claims in GriefPrevention"),
    /**
     * Have at least {0} remaining blocks to use in claims in GriefPrevention
     */
    GRIEF_PREVENTION_REMAINING_BLOCKS_REQUIREMENT("grief-prevention-remaining-blocks-requirement", "Have at least {0} remaining blocks to use in claims in GriefPrevention"),
    /**
     * &6{0}&7 has played for {1}.
     */
    HAS_PLAYED_FOR("has-played-for", "&6{0}&7 has played for {1}."),
    /**
     * hours
     */
    HOUR_PLURAL("hour-plural", "hours"),
    /**
     * hour
     */
    HOUR_SINGULAR("hour-singular", "hour"),
    /**
     * Be in biome '{0}'.
     */
    IN_BIOME_REQUIREMENT("in-biome-requirement", "Be in biome {0}"),
    /**
     * &cInvalid format, use {0}.
     */
    INVALID_FORMAT("invalid-format", "&cInvalid format, use {0}."),
    /**
     * &cYou have not specified a valid leaderboard type! &eOnly 'total',
     * 'daily', 'weekly' and 'monthly' are allowed.
     */
    INVALID_LEADERBOARD_TYPE("invalid-leaderboard-type", "&cYou have not specified a valid leaderboard type! &eOnly " +
            "'total', 'daily', 'weekly' and 'monthly' are allowed."),
    /**
     * &c{0} is not a valid number!
     */
    INVALID_NUMBER("invalid-number", "&c{0} is not a valid number!"),
    /**
     * Obtain {0}.
     */
    ITEM_REQUIREMENT("item-requirement", "Obtain {0}"),
    /**
     * Craft at least {0} item(s).
     */
    ITEMS_CRAFTED_REQUIREMENT("items-crafted-requirement", "Craft at least {0} item(s)"),
    /**
     * Have at least {0} points in Jobs
     */
    JOBS_CURRENT_POINTS_REQUIREMENT("jobs-current-points-requirement", "Have at least {0} points in Jobs"),
    /**
     * Have at least {0} experience in the job '{1}'
     */
    JOBS_EXPERIENCE_REQUIREMENT("jobs-experience-requirement", "Have at least {0} experience in the job '{1}'"),
    /**
     * Have at least level {0} in the job '{1}'
     */
    JOBS_LEVEL_REQUIREMENT("jobs-level-requirement", "Have at least level {0} in the job '{1}'"),
    /**
     * Have at least {0} points in total in Jobs
     */
    JOBS_TOTAL_POINTS_REQUIREMENT("jobs-total-points-requirement", "Have at least {0} points in total in Jobs"),
    /**
     * &a------------------------------------
     */
    LEADERBOARD_FOOTER("leaderboard-footer", "&a------------------------------------"),
    /**
     * &a-------- Leaderboard (All time) --------
     */
    LEADERBOARD_HEADER_ALL_TIME("leaderboard-header-all-time", "&a-------- Leaderboard (All time) --------"),
    /**
     * &a-------- Leaderboard (Daily time) --------
     */
    LEADERBOARD_HEADER_DAILY("leaderboard-header-daily", "&a-------- Leaderboard (Daily time) --------"),
    /**
     * &a-------- Leaderboard (Monthly time) --------
     */
    LEADERBOARD_HEADER_MONTHLY("leaderboard-header-monthly", "&a-------- Leaderboard (Monthly time) --------"),
    /**
     * &a-------- Leaderboard (Weekly time) --------
     */
    LEADERBOARD_HEADER_WEEKLY("leaderboard-header-weekly", "&a-------- Leaderboard (Weekly time) --------"),
    /**
     * Be at {0}.
     */
    LOCATION_REQUIREMENT("location-requirement", "Be at {0}"),
    /**
     * Have at least power level {0}.
     */
    MCMMO_POWER_LEVEL_REQUIREMENT("mcmmo-power-level-requirement", "Have at least power level {0}"),
    /**
     * Have at least level {0} in {1}.
     */
    MCMMO_SKILL_LEVEL_REQUIREMENT("mcmmo-skill-level-requirement", "Have at least level {0} in {1}"),
    /**
     * meets all the requirements for path {0}
     */
    MEETS_ALL_REQUIREMENTS("meets-all-requirements", "meets all the requirements for path {0}"),
    /**
     * meets all the requirements
     */
    MEETS_ALL_REQUIREMENTS_WITHOUT_RANK_UP("meets-all-requirements-without-rank-up", "meets all the requirements"),
    /**
     * Send you the following message: {0}
     */
    MESSAGE_RESULT("message-result", "Send you the following message: {0}"),
    /**
     * minutes
     */
    MINUTE_PLURAL("minute-plural", "minutes"),
    /**
     * minute
     */
    MINUTE_SINGULAR("minute-singular", "minute"),
    /**
     * Have at least {0}.
     */
    MONEY_REQUIREMENT("money-requirement", "Have at least {0}"),
    /**
     * &cMySQL is not enabled!
     */
    MYSQL_IS_NOT_ENABLED("mysql-is-not-enabled", "&cMySQL is not enabled!"),
    /**
     * none (no path found)
     */
    NO_FURTHER_PATH_FOUND("no-further-path-found", "none (no path found)"),
    /**
     * &cThere was no ranking path found with that name.
     */
    NO_PATH_FOUND_WITH_THAT_NAME("no-path-found-with-that-name", "&cThere was no ranking path found with that name."),
    /**
     * &cYou need ({0}) for that!
     */
    NO_PERMISSION("no-permission", "&cYou need ({0}) for that!"),
    /**
     * Optional
     */
    OPTIONAL_MARKER("optional-marker", "Optional"),
    /**
     * &cYou cannot use this command as this server has not enabled partial
     * completion!
     */
    PARTIAL_COMPLETION_NOT_ENABLED("partial-completion-not-enabled", "&cYou cannot use this command as this server " +
            "has not enabled partial completion!"),
    /**
     * Have permission '{0}'.
     */
    PERMISSION_REQUIREMENT("permission-requirement", "Have permission {0}"),
    /**
     * Place at least {0}.
     */
    PLACED_BLOCKS_REQUIREMENT("placed-blocks-requirement", "Place at least {0}"),
    /**
     * &c{0} is excluded from ranking!
     */
    PLAYER_IS_EXCLUDED("player-is-excluded", "&c{0} is excluded from ranking!"),
    /**
     * &6{0}&c has never been logged before.
     */
    PLAYER_IS_INVALID("player-is-invalid", "&6{0}&c has never been logged before."),
    /**
     * Kill at least {0} player(s).
     */
    PLAYER_KILLS_REQUIREMENT("player-kills-requirement", "Kill at least {0} player(s)"),
    /**
     * &6{0}&c is not online!
     */
    PLAYER_NOT_ONLINE("player-not-online", "&6{0}&c is not online!"),
    /**
     * Changed playtime of {0} to {1}.
     */
    PLAYTIME_CHANGED("playtime-changed", "Changed playtime of {0} to {1}."),
    /**
     * &eYour progress for the rank is reset.
     */
    PROGRESS_RESET("progress-reset", "&eYour progress for the path is reset."),
    /**
     * &eYour progress for the path has been restored.
     */
    PROGRESS_RESTORED("progress-restored", "&eYour progress for the path has been restored."),
    /**
     * Change rank to {0}.
     */
    RANK_CHANGE_RESULT("rank-change-result", "Change rank to {0}."),
    /**
     * and now completed his path.
     */
    COMPLETED_PATH_NOW("completed-path-now", " and now completed his path."),
    /**
     * Progress of requirement {0}:
     */
    REQUIREMENT_PROGRESS("requirement-progress", "Progress of requirement {0}:"),
    /**
     * &6[Autorank] &5A new day has arrived! &eAll daily times have been reset.
     */
    RESET_DAILY_TIME("reset-daily-time", "&6[Autorank] &5A new day has arrived! &eAll daily times have been reset."),
    /**
     * &6[Autorank] &5A new day has arrived! &eAll daily times have been reset.
     */
    RESET_MONTHLY_TIME("reset-monthly-time", "&6[Autorank] &5A new month has arrived! &eAll monthly times have been reset."),
    /**
     * &6[Autorank] &5A new day has arrived! &eAll daily times have been reset.
     */
    RESET_WEEKLY_TIME("reset-weekly-time", "&6[Autorank] &5A new week has arrived! &eAll weekly times have been reset."),
    /**
     * Have at least a combat level of {0} in RPGme.
     */
    RPGME_COMBAT_LEVEL_REQUIREMENT("rpgme-combat-level-requirement", "Have at least a combat level of {0} in RPGme."),
    /**
     * Have at least a combined level {0} of RPGMe.
     */
    RPGME_POWER_LEVEL_REQUIREMENT("rpgme-power-level-requirement", "Have at least a combined level {0} of RPGMe."),
    /**
     * Have at least level {0} in {1} in RPGme.
     */
    RPGME_SKILL_LEVEL_REQUIREMENT("rpgme-skill-level-requirement", "Have at least level {0} in {1} in RPGme."),
    /**
     * minutes
     */
    SECOND_PLURAL("second-plural", "seconds"),
    /**
     * minute
     */
    SECOND_SINGULAR("second-singular", "second"),
    /**
     * Spawn firework at {0}.
     */
    SPAWN_FIREWORK_RESULT("spawn-firework-result", "Spawn firework at {0}."),
    /**
     * You have successfully completed requirement #{0}:
     */
    SUCCESSFULLY_COMPLETED_REQUIREMENT("successfully-completed-requirement", "You have successfully completed " +
            "requirement &6{0}&a:"),
    /**
     * Get teleported to {0}.
     */
    TELEPORT_RESULT("teleport-result", "Get teleported to {0}."),
    /**
     * Play for at least {0}.
     */
    TIME_REQUIREMENT("time-requirement", "Play for at least {0}"),
    /**
     * Play for at least {0} in a single day.
     */
    TIME_DAILY_REQUIREMENT("time-daily-requirement", " Play for at least {0} in a single day."),
    /**
     * Play for at least {0} in a week.
     */
    TIME_WEEKLY_REQUIREMENT("time-weekly-requirement", " Play for at least {0} in a week."),
    /**
     * Play for at least {0} in a month.
     */
    TIME_MONTHLY_REQUIREMENT("time-monthly-requirement", " Play for at least {0} in a month."),
    /**
     * Shear at least {0} sheep.
     */
    TIMES_SHEARED_REQUIREMENT("times-sheared-requirement", "Shear at least {0} sheep"),
    /**
     * Kill at least {0}.
     */
    TOTAL_MOBS_KILLED_REQUIREMENT("total-mobs-killed-requirement", "Kill at least {0}"),
    /**
     * Be with this server for at least {0}.
     */
    TOTAL_TIME_REQUIREMENT("total-time-requirement", "Be with this server for at least {0}"),
    /**
     * &cPlayer {0} is unknown and couldn't be identified.
     */
    UNKNOWN_PLAYER("unknown-player", "&cPlayer {0} is unknown and couldn't be identified."),
    /**
     * Vote at least {0} times.
     */
    VOTE_REQUIREMENT("vote-requirement", "Vote at least {0} times"),
    /**
     * Be in region '{0}'.
     */
    WORLD_GUARD_REGION_REQUIREMENT("world-guard-region-requirement", "Be in region {0}"),
    /**
     * Be in {0}.
     */
    WORLD_REQUIREMENT("world-requirement", "Be in {0}"),
    /**
     * &cYou are a robot, '{0}'
     */
    YOU_ARE_A_ROBOT("you-are-a-robot", "&cYou are a robot, {0}"),
    /**
     * Be in group {0}.
     */
    GROUP_REQUIREMENT("group-requirement", "Be in group {0}."),
    /**
     * Reward you with {0}.
     */
    MONEY_RESULT("money-result", "Reward you with {0}."),
    /**
     * &2You have automatically been assigned the path '&6{0}&2'.
     */
    AUTOMATICALLY_ASSIGNED_PATH("automatically-assigned-path", "&2You have automatically been assigned the path '&6{0}&2'."),
    /**
     * &2You completed requirement &6{0}&2: &3{1}
     */
    COMPLETED_REQUIREMENT("completed-requirement", "&2You completed requirement &6{0}&2: &3{1}"),
    /**
     * &2{0} has played for {1} and currently has no path. There are no paths
     * left to choose.
     */
    NO_PATH_LEFT_TO_CHOOSE("no-path-left-to-choose", "&2{0} has played for {1} and currently has no path. There are no paths left to choose."),
    /**
     * &cYou already completed this path before. You are not allowed to retake
     * it!
     */
    PATH_NOT_ALLOWED_TO_RETAKE("path-not-allowed-to-retake", "&cYou already completed this path before. You are not allowed to retake it!"),
    /**
     * &cThere are no paths that you can choose.
     */
    NO_PATHS_TO_CHOOSE("no-paths-to-choose", "&cThere are no paths that you can choose."),
    /**
     * Have at least a level of {0} in BattleLevels.
     */
    BATTLELEVELS_LEVEL_REQUIREMENT("battlelevels-level-requirement", "Have at least a level of {0} in " +
            "BattleLevels."),
    /**
     * Killed at least {0} players in BattleLevels.
     */
    BATTLELEVELS_KILLS_REQUIREMENT("battlelevels-kills-requirement", "Killed at least {0} players in " +
            "BattleLevels."),
    /**
     * Have at least a score of {0} players in BattleLevels.
     */
    BATTLELEVELS_SCORE_REQUIREMENT("battlelevels-score-requirement", "Have at least a score of {0} in " +
            "BattleLevels."),
    /**
     * Kill at least {0} players in a row in BattleLevels.
     */
    BATTLELEVELS_NORMAL_KILLSTREAK_REQUIREMENT("battlelevels-normal-killstreak-requirement", "Kill at least " +
            "{0} players in a row in BattleLevels."),
    /**
     * Killed at least {0} players in a row in BattleLevels.
     */
    BATTLELEVELS_TOP_KILLSTREAK_REQUIREMENT("Killed at least {0} players in a row in BattleLevels."),
    /**
     * Have at least a KDR of {0} in BattleLevels.
     */
    BATTLELEVELS_KILL_DEATH_RATIO_REQUIREMENT("Have at least a KDR of {0} in BattleLevels."),
    /**
     * Have {0} quests active at the same time.
     */
    QUESTS_ACTIVE_QUESTS_REQUIREMENT("Have {0} quests active at the same time."),
    /**
     * Complete at least {0} quests.
     */
    QUESTS_COMPLETED_QUESTS_REQUIREMENT("Complete at least {0} quests."),
    /**
     * Obtain at least {0} quest points.
     */
    QUESTS_QUEST_POINTS_REQUIREMENT("Obtain at least {0} quest points."),
    /**
     * Complete the quest '{0}'.
     */
    QUESTS_COMPLETE_SPECIFIC_QUEST_REQUIREMENT("Complete the quest '{0}'."),
    /**
     * Obtain at least {0} player points.
     */
    PLAYERPOINTS_POINTS_REQUIREMENT("Obtain at least {0} player points."),
    /**
     * You are not active on path {0}.
     */
    PATH_IS_NOT_ACTIVE("You are not active on path {0}."),
    /**
     * Have at least {0} active paths.
     */
    AUTORANK_NUMBER_OF_ACTIVE_PATHS_REQUIREMENT("Have at least {0} active paths."),
    /**
     * Have '{0}' set as an active path.
     */
    AUTORANK_SPECIFIC_ACTIVE_PATH_REQUIREMENT("Have '{0}' set as an active path."),
    /**
     * Have at least completed {0} paths.
     */
    AUTORANK_NUMBER_OF_COMPLETED_PATHS_REQUIREMENT("Have at least completed {0} paths."),
    /**
     * Have completed path '{0}'.
     */
    AUTORANK_SPECIFIC_COMPLETED_PATH_REQUIREMENT("Have completed path '{0}'."),
    /**
     * Get at least {0} kills
     */
    UHC_STATS_KILLS_REQUIREMENT("Get at least {0} kills."),
    /**
     * Get at least {0} deaths
     */
    UHC_STATS_DEATHS_REQUIREMENT("Get at least {0} deaths."),
    /**
     * Get at least {0} wins
     */
    UHC_STATS_WINS_REQUIREMENT("Get at least {0} wins."),
    /**
     * Need to be part of a town.
     */
    TOWNY_HAS_TOWN_REQUIREMENT("Need to be part of a town."),
    /**
     * Need to be part of a nation.
     */
    TOWNY_HAS_NATION_REQUIREMENT("Need to be part of a nation."),
    /**
     * Need to be mayor of a town
     */
    TOWNY_IS_MAYOR_REQUIREMENT("Need to be mayor of a town."),
    /**
     * Need to be king of a nation
     */
    TOWNY_IS_KING_REQUIREMENT("Need to be king of a nation."),
    /**
     * Need to have at least {0} town blocks.
     */
    TOWNY_NEED_NUMBER_OF_TOWN_BLOCKS("Need to have at least {0} town blocks."),
    /**
     * Have at least power level {0}.
     */
    MCRPG_POWER_LEVEL_REQUIREMENT("Have at least power level {0}"),
    /**
     * Have at least level {0} in {1}.
     */
    MCRPG_SKILL_LEVEL_REQUIREMENT("Have at least level {0} in {1}"),
    /**
     * Breed at least {0} animals
     */
    ANIMALS_BRED_REQUIREMENT("Breed at least {0} animals"),
    /**
     * Eat at least {0} slices of cake
     */
    CAKESLICES_EATEN_REQUIREMENT("Eat at least {0} slices of cake"),
    /**
     * Enchant at least {0} items
     */
    ITEMS_ENCHANTED_REQUIREMENT("Enchant at least {0} items"),
    /**
     * Die at least {0} times
     */
    TIMES_DIED_REQUIREMENT("Die at least {0} times"),
    /**
     * Pot at least {0} plants
     */
    PLANTS_POTTED_REQUIREMENT("Pot at least {0} plants"),
    /**
     * Trade at least {0} with villagers
     */
    TIMES_TRADED_WITH_VILLAGERS_REQUIREMENT("Trade at least {0} with villagers"),
    /**
     * Throw at least {0} {1}.
     */
    ITEM_THROWN_REQUIREMENT("Throw at least {0} {1}."),
    /**
     * Craft at least {0} {1}.
     */
    ITEM_CRAFTED_REQUIREMENT("Craft at least {0} {1}."),
    /**
     * Have at least {0} mana.
     */
    AURELIUM_SKILLS_MANA_REQUIREMENT("Have at least {0} mana."),
    /**
     * Reach level {0} in {1}.
     */
    AURELIUM_SKILLS_STAT_REQUIREMENT("Reach level {0} in {1}."),
    /**
     * Reach level {0} in {1}.
     */
    AURELIUM_SKILLS_SKILL_REQUIREMENT("Reach level {0} in {1}."),
    /**
     * Have {0} xp in {1}.
     */
    AURELIUM_SKILLS_XP_REQUIREMENT("Have {0} xp in {1}."),
    

    /**
     * Invalid storage file. You can only backup 'playerdata' or 'storage'.
     */
    BACKUP_INVALID("BACKUP-INVALID", "&cInvalid storage file. You can only backup 'playerdata' or 'storage'."),
        /**
     * Successfully created a backup of playerdata!
     */
    BACKUP_SUCCESS_PLAYERDATA("BACKUP-SUCCESS-PLAYERDATA", "&aSuccessfully created a backup of playerdata!"),
    /**
     * Successfully created a backup of regular time storage!
     */
    BACKUP_SUCCESS_STORAGE("BACKUP-SUCCESS-STORAGE", "&aSuccessfully created a backup of regular time storage!"),
    
    /**
     * {0} does not have any active paths.
     */
    CHECK_NO_ACTIVE_PATH("CHECK-NO-ACTIVE-PATH", "&6{0} &cdoes not have any active paths."),
    /**
     * ----- [Progress of paths for &6{0}] -----
     */
    CHECK_PLAYER_PROGRESS_HEADER("CHECK-PLAYER-PROGRESS-HEADER", "&a----- &7[Progress of paths for &6{0}&7] &a-----"),
    /**
     * Progress of '{0}': 
     */
    CHECK_PATH_PROGRESS_HEADER("CHECK-PATH-PROGRESS-HEADER", "&7Progress of '&9{0}&7': "),
    /**
     * To view the progress of a specific path, use /ar check <path name>.
     */
    CHECK_PLAYER_PROGRESS_FOOTER("CHECK-PLAYER-PROGRESS-FOOTER", "&cTo view the progress of a specific path, use /ar check <path name>."),
    /**
     * -----------------------
     */
    CHECK_SPECIFIC_PATH_LINE_1("CHECK-SPECIFIC-PATH-LINE-1", "&3-----------------------"),
    /**
     * You are viewing the path {0} for {1}.
     */
    CHECK_SPECIFIC_PATH_LINE_2("CHECK-SPECIFIC-PATH-LINE-2", "&2You are viewing the path &6{0} &2for {1}."),
    /**
     * -----------------------
     */
    CHECK_SPECIFIC_PATH_LINE_3("CHECK-SPECIFIC-PATH-LINE-3", "&3-----------------------"),
    /**
     * Requirements:
     */
    CHECK_SPECIFIC_PATH_LINE_4("&7Requirements:"),
    /**
     * You should specify a player to check.
     */
    CHECK_PATH_ERROR("CHECK-PATH-ERROR", "&cYou should specify a player to check."),
    /**
     * There is no player or path named {0}'.
     */
    CHECK_PATH_ERROR_NO_PLAYER("CHECK-PATH-ERROR-NO-PLAYER", "&cThere is no player or path named {0}."),
    /**
     * {0} does not have {1} as an active path!
     */
    CHECK_PATH_ERROR_NO_SPECIFIED_ACTIVE_PATH("CHECK-PATH-ERROR-NO-SPECIFIED-ACTIVE-PATH", "&6{0} &cdoes not have &7{1} &cas an active path!"),
    
    /**
     * You do not meet the prerequisites of this path!
     */
    CHOOSE_UNMET_PREREQUISITES_PATH("CHOOSE-UNMET-PREREQUISITES-PATH", "&cYou do not meet the prerequisites of this path!"),
    /**
     * Type /ar view {0} to see a list of prerequisites.
     */
    CHOOSE_UNMET_PREREQUISITES_PATH_2("CHOOSE-UNMET-PREREQUISITES-PATH_2", "&cType &6/ar view &6{0} &cto see a list of prerequisites."),
    /**
     * You are on cooldown for this path!
     */
    CHOOSE_PATH_COOLDOWN("CHOOSE-PATH-COOLDOWN", "You are on cooldown for this path!"),
    /**
     * You need to wait {0}
     */
    CHOOSE_PATH_COOLDOWN_2("CHOOSE-PATH-COOLDOWN-2", "You need to wait {0}"),
    
    /**
     * This path does not allow you to complete requirements one by one. 
     * You need to meet all requirements simulateneously.
     */
    COMPLETE_REQUIREMENT_NO_PARTIAL("CHOOSE-REQUIREMENT-NO-PARTIAL", "&cThis path does not allow you to complete requirements one by one. You need to meet all requirements simulateneously."),
    /**
     * This path does not allow you to complete requirements one by one. 
     * You need to meet all requirements simulateneously.
     */
    COMPLETE_REQUIREMENT_FULFILLED("CHOOSE-REQUIREMENT-FULFILLED", "&aYou don't have any requirements left."),
    
    /**
     * Path '{0}' is deactivated and your progress for this path has been reset.
     */
    DEACTIVATE_PATH_PROGRESS_RESET("DEACTIVATE-PATH-PROGRESS-RESET", "&aPath '{0}' &6is deactivated and your progress for this path has been reset."),
    /**
     * Path '{0}' is deactivated and your progress for this path has been stored.
     */    
    DEACTIVATE_PATH_PROGRESS_STORED("DEACTIVATE-PATH-PROGRESS-STORED", "&aPath '{0}' &6is deactivated and your progress for this path has been stored."),    
    /**
     * Debug mode of Autorank has been enabled
     */    
    DEBUG_ENABLED("DEBUG-ENABLED", "&6Debug mode of Autorank has been &aenabled"),
    /**
     * Debug mode of Autorank has been disabled
     */    
    DEBUG_DISABLED("DEBUG-DISABLED", "&6Debug mode of Autorank has been &adisabled"),
    /**
     * Debug file '{0}' created!
     */    
    DEBUG_FILE_CREATED("DEBUG-DISABLED", "&aDebug file '{0}' created!"),    
    /**
     * Assigned {0} to {1}
     */
    EDITOR_ASSIGN_PATH_SUCCESS("EDITOR-ASSIGN-PATH-SUCCESS", "&aAssigned '&6{0}' &ato {1}"),
    /**
     * Could not assigne {0} to {1}
     */
    EDITOR_ASSIGN_PATH_FAIL("EDITOR-ASSIGN-PATH-FAIL", "&cCould not assign '&6{0}' &cto {1}"),
    /**
     * Unassigned {0} to {1}
     */
    EDITOR_UNASSIGN_PATH("EDITOR-UNASSIGN-PATH", "&aUnassigned '&6{0}' &afrom {1}"),
    /**
     * Path {0} has been completed for {1}
     */
    EDITOR_COMPLETE_PATH("EDITOR-COMPLETE-PATH", "&aPath '&6{0}' &ahas been completed for {1}"),
    /**
     * Requirement {0} has been completed for {1}
     */
    EDITOR_COMPLETE_PATH_REQUIREMENT("EDITOR-COMPLETE-PATH-REQUIREMENT", "&aRequirement &6{0} &ahas been completed for {1}"),
    /**
     * {0} checked!
     */
    FORCECHECK_DONE("FORCECHECK-DONE", "&6{0} checked!"),
    /**
     * {0} has played for {1} across all servers.
     */
    GLOBALCHECK_RESULT("GLOBALCHECK-RESULT", "{0} has played for {1} across all servers."),
    /**
     * -- Autorank Commands --
     */
    HELP_HEADER("HELP-HEADER", "&a-- Autorank Commands --"),
    /**
     * Page {0} of {1}
     */
    HELP_FOOTER("HELP-FOOTER", "&9Page {0} of {1}"),
    /**
     * Cannot show dependencies as PluginLibrary is not installed
     */
    HOOKS_CANNOT_SHOW("HOOKS-CANNOT-SHOW", "&cCannot show dependencies as PluginLibrary is not installed"),
    /**
     * Autorank Hooks:
     */
    HOOKS_LIST("HOOKS-LIST", "&6Autorank Hooks:"),
    /**
     * Imported data of {0} players from Minecraft statistics!:
     */
    IMPORT_MINECRAFT_STATS("IMPORT-MINECRAFT-STATS", "Imported data of {0} players from Minecraft statistics!"),
    /**
     * There are no active storage providers, so I can't store the imported data!
     */
    IMPORT_FAILED_NO_PROVIDER("IMPORT-FAILED-NO-PROVIDER", "&cThere are no active storage providers, so I can't store the imported data!"),
    /**
     * You want to store the imported data to the global database, but no database is active.
     */
    IMPORT_FAILED_NO_DATABASE("IMPORT-FAILED-NO-DATABASE", "&cYou want to store the imported data to the global database, but no database is active."),
    /**
     * Importing data and overriding both the global and local database.
     */
    IMPORT_OVERWRITE_BOTH("IMPORT-OVERWRITE-BOTH", "&6Importing data and overriding both the global and local database."),
    /**
     * Importing data and overriding global database.
     */
    IMPORT_OVERWRITE_GLOBAL("IMPORT-OVERWRITE-GLOBAL", "&6Importing data and overriding global database."),
    /**
     * Importing data and adding to global database.
     */
    IMPORT_APPEND_GLOBAL("IMPORT-APPEND-GLOBAL", "&6Importing data and adding to global database."),
    /**
     * Importing data and overriding local database.
     */
    IMPORT_OVERWRITE_LOCAL("IMPORT-OVERWRITE-LOCAL", "&6Importing data and overriding local database."),
    /**
     * Importing data and adding to local database.
     */
    IMPORT_APPEND_LOCAL("IMPORT-APPEND-LOCAL", "&6Importing data and adding to local database."),
    /**
     * Could not import any players for {0}! Are you sure you put any files in the imports folder?
     */
    IMPORT_FAILED_NO_FILES("IMPORT-FAILED-NO-FILES", "&cCould not import any players for {0}! Are you sure you put any files in the imports folder?"),
    /**
     * Import operation cancelled by user.
     */
    IMPORT_CANCELLED("IMPORT-CANCELLED", "&cImport operation cancelled by user."),
    /**
     * ---------- [playerName] ----------
     */
    INFO_HEADER("INFO-HEADER", "&3---------- [ &6playerName &3] ----------"),
    /**
     *  and 
     */
    INFO_SECONDLAST_ACTIVE_CONNECTOR("INFO-SECONDLAST-ACTIVE-CONNECTOR", " and "),
    /**
     *  and 
     */
    INFO_SECONDLAST_COMPLETED_CONNECTOR("INFO-SECONDLAST-COMPLETED-CONNECTOR", " and "),
    /**
     * Active paths ({0}): {1}
     */
    INFO_ACTIVEPATH_LIST("IMPORT-ACTIVEPATH-LIST", "&dActive paths (&6{0}&d): {1}"),
    /**
     * Completed paths ({0}): {1}
     */
    INFO_COMPLETEDPATH_LIST("IMPORT-COMPLETEDPATH-LIST", "&dCompleted paths (&6{0}&d): {1}"),
    /**
     * none
     */
    INFO_NIL_PATH("INFO-NIL-PATH", "none"),
    /**
     * Is exempted from leaderboard: {0}
     */
    INFO_EXEMPTED_LEADERBOARD("INFO-EXEMPTED-LEADERBOARD", "&dIs exempted from leaderboard: {0}"),
    /**
     * Is exempted from checking: {0}
     */
    INFO_EXEMPTED_CHECKING("INFO-EXEMPTED-CHECKING", "&dIs exempted from checking: {0}"),
    /**
     * Is exempted from obtaining time: {0}
     */
    INFO_EXEMPTED_OBTAINING_TIME("INFO-EXEMPTED-OBTAINING-TIME", "&dIs exempted from obtaining time: {0}"),
    /**
     * True
     */
    INFO_BOOLEAN_TRUE("INFO-BOOLEAN-TRUE", "&atrue"),
    /**
     * False
     */
    INFO_BOOLEAN_FALSE("INFO-BOOLEAN-TRUE", "&cfalse"),
    /**
     * none
     */
    INFO_NIL_PLAYTIME("INFO-NIL-PLAYTIME", "none"),
    /**
     * Local playtime: {0}
     */
    INFO_PLAYTIME_LOCAL("INFO-PLAYTIME-LOCAL", "&dLocal playtime: &6{0}"),
    /**
     * Global playtime: {0}
     */
    INFO_PLAYTIME_GLOBAL("INFO-PLAYTIME-GLOBAL", "&dGlobal playtime: &6{0}"),
    /**
     * Updating the leaderboard. This could take a while!
     */
    LEADERBOARD_FORCEUPDATE_1("LEADERBOARD-FORCEUPDATE-1", "&aUpdating the leaderboard. This could take a while!"),
    /**
     * I'll let you know when the leaderboard is updated.
     */
    LEADERBOARD_FORCEUPDATE_2("LEADERBOARD-FORCEUPDATE-2", "&6I'll let you know when the leaderboard is updated."),
    /**
     * Leaderboard updated!
     */
    LEADERBOARD_FORCEUPDATE_DONE("LEADERBOARD-FORCEUPDATE-DONE", "&eLeaderboard updated!"),
    /**
     * This is not a valid type of migration!
     */
    MIGRATE_INVALID_TYPE("MIGRATE-INVALID-TYPE", "&cThis is not a valid type of migration!"),
    /**
     * Could not find a migration plugin for the type you specified.
     */
    MIGRATE_SOURCE_NOTFOUND("MIGRATE-SOURCE-NOTFOUND", "&cCould not find a migration plugin for the type you specified."),
    /**
     * This migration plugin is not ready to be used. Are the plugins that depend on it active?
     */
    MIGRATE_SOURCE_NOTREADY("MIGRATE-SOURCE-NOTREADY", "&cThis migration plugin is not ready to be used. Are the plugins that depend on it active?"),
    /**
     * {0} players have been migrated to Autorank.
     */
    MIGRATE_SUCCESS("MIGRATE-SUCCESS", "&a{0} players have been migrated to Autorank."),
    /**
     * Reset progress on all active paths of {0}
     */
    RESET_ACTIVE_PROGRESS("RESET-ACTIVE-PROGRESS", "&aReset progress on all active paths of &e{0}"),
    /**
     * Removed all active paths of {0}
     */
    RESET_ACTIVE_PATHS("RESET-ACTIVE-PATHS", "&aReset progress on all active paths of &e{0}"),
    /**
     * Removed all completed paths of {0}
     */
    RESET_COMPLETED_PATHS("RESET-COMPLETED-PATHS", "&aRemoved all completed paths of &e{0}"),
    /**
     * Reset progress on all paths (active AND completed) of {0}
     */
    RESET_ALL_PROGRESS("RESET-ALL-PROGRESS", "&aReset progress on all paths (active AND completed) of &e{0}"),
    /**
     * You probably meant /ar syncstats or /ar sync!
     */
    SYNC_SUGGESTION("SYNC-SUGGESTION", "&cYou probably meant /ar syncstats or /ar sync!"),
    /**
     * There is no active storage provider that supports flatfile data.
     */
    SYNC_FLATFILE_STORAGE_NOTACTIVE("SYNC-FLATFILE-STORAGE-NOTACTIVE", "&cThere is no active storage provider that supports flatfile data."),
    /**
     * You do not have to use this command regularly.
     */
    SYNC_NOTICE("SYNC-NOTICE", "&cYou do not have to use this command regularly."),
    /**
     * Successfully updated {0} items in data.yml from MySQL database records!
     */
    SYNC_SUCCESS_LOCAL("SYNC-SUCCESS-LOCAL", "&aSuccessfully updated {0} items in data.yml from MySQL database records!"),
    /**
     * Successfully updated MySQL records!
     */
    SYNC_SUCCESS_MYSQL("SYNC-SUCCESS-MYSQL", "&aSuccessfully updated MySQL records!"),
    /**
     * Could not sync stats. Run command again!
     */
    SYNC_STATS_FAILED("SYNC-STATS-FAILED", "&aCould not sync stats. Run command again!"),
    /**
     * Time has succesfully been updated for all entries.
     */
    SYNC_STATS_SUCCESS("SYNC-STATS-SUCCESS", "&aTime has succesfully been updated for all entries."),
    /**
     * You don't have any requirements!
     */
    TRACK_NO_REQUIREMENT("TRACK-NO-REQUIREMENT", "&cYou don't have any requirements!"),
    /**
     * Current: {0}
     */
    TRACK_CURRENT_REQUIREMENT("TRACK-CURRENT-REQUIREMENT", "&aCurrent: &6{0}"),
    /**
     * The following paths are possible: 
     */
    VIEW_POSSIABLE_PATHS("VIEW-POSSIBLE-PATHS", "&aThe following paths are possible: "),
    /**
     * Prerequisites of path {0}:
     */
    VIEW_PATH_PREREQUISITES("VIEW-PATH-PREREQUISITES", "&aPrerequisites of path &7{0}&a:"),
    /**
     * none
     */
    VIEW_PATH_NIL_PREREQUISITES("VIEW-PATH-NIL-PREREQUISITES", "none"),
    /**
     * Requirements of path {0}: 
     */
    VIEW_PATH_REQUIREMENT("VIEW-PATH-REQUIREMENT", "&aRequirements of path &7{0}&a:"),
    /**
     * none
     */
    VIEW_PATH_NIL_REQUIREMENT("VIEW-PATH-NIL-REQUIREMENT", "none"),
    /**
     * Requirements of path {0}: 
     */
    VIEW_PATH_RESULTS("VIEW-PATH-RESULTS", "&aRequirements of path &7{0}&a:"),
    /**
     * none
     */
    VIEW_PATH_NIL_RESULTS("VIEW-PATH-NIL-RESULTS", "none"),




    /**
     * Add [value] to [player]'s time
     */
    DESC_ADD_COMMAND("DESC-ADD-COMMAND", "Add [value] to [player]'s time"),
    /**
     * Backup files with playerdata and/or regular storage.
     */
    DESC_BACKUP_COMMAND("DESC-BACKUP-COMMAND", "Backup files with playerdata and/or regular storage."),
    /**
     * Check [player]'s status
     */
    DESC_CHECK_COMMAND("DESC-CHECK-COMMAND", "Check [player]'s status"),
    /**
     * Activate a path
     */
    DESC_CHOOSE_COMMAND("DESC-CHOOSE-COMMAND", "Activate a path"),
    /**
     * Complete a requirement at this moment
     */
    DESC_COMPLETE_COMMAND("DESC-COMPLETE-COMMAND", "Complete a requirement at this moment"),
    /**
     * Deactivate a path
     */
    DESC_DEACTIVATE_COMMAND("DESC-DEACTIVATE-COMMAND", "Deactivate a path"),
    /**
     * Shows debug information.
     */
    DESC_DEBUG_COMMAND("DESC-DEBUG-COMMAND", "Shows debug information."),
    /**
     * Edit player data of any player
     */
    DESC_EDITOR_COMMAND("DESC-EDITOR-COMMAND", "Edit player data of any player."),
    /**
     * Do a manual silent check.
     */
    DESC_FORCECHECK_COMMAND("DESC-FORCECHECK-COMMAND", "Edit player data of any player."),
    /**
     * Add [value] to [player]'s global time
     */
    DESC_GLOBALADD_COMMAND("DESC-GLOBALADD-COMMAND", "Add [value] to [player]'s global time"),
    /**
     * Check [player]'s global playtime.
     */
    DESC_GLOBALCHECK_COMMAND("DESC-GLOBALCHECK-COMMAND", "Check [player]'s global playtime."),
    /**
     * Set [player]'s global time to [value].
     */
    DESC_GLOBALSET_COMMAND("DESC-GLOBALSET-COMMAND", "Set [player]'s global time to [value]."),
    /**
     * Show a list of commands.
     */
    DESC_HELP_COMMAND("DESC-HELP-COMMAND", "Show a list of commands."),
    /**
     * Shows a list of plugins Autorank is hooked into.
     */
    DESC_HOOKS_COMMAND("DESC-HOOKS-COMMAND", "Shows a list of plugins Autorank is hooked into."),
    /**
     * Import time data from your flatfiles into the system.
     */
    DESC_IMPORT_COMMAND("DESC-IMPORT-COMMAND", "Import time data from your flatfiles into the system."),
    /**
     * Show info of a player.
     */
    DESC_INFO_COMMAND("DESC-INFO-COMMAND", "Show info of a player."),
    /**
     * Show the leaderboard.
     */
    DESC_LEADERBOARD_COMMAND("DESC-LEADERBOARD-COMMAND", "Show the leaderboard."),
    /**
     * Migrate play time data from another plugin to Autorank
     */
    DESC_MIGRATE_COMMAND("DESC-MIGRATE-COMMAND", "Migrate play time data from another plugin to Autorank"),
    /**
     * Reload Autorank.
     */
    DESC_RELOAD_COMMAND("DESC-RELOAD-COMMAND", "Reload Autorank."),
    /**
     * Remove [value] from [player]'s time.
     */
    DESC_REMOVE_COMMAND("DESC-REMOVE-COMMAND", "Remove [value] from [player]'s time."),
    /**
     * Reset certain storage of a player
     */
    DESC_RESET_COMMAND("DESC-RESET-COMMAND", "Reset certain storage of a player"),
    /**
     * Set [player]'s time to [value].
     */
    DESC_SET_COMMAND("DESC-SET-COMMAND", "Set [player]'s time to [value]."),
    /**
     * Sync MySQL database with server (Use only once per server).
     */
    DESC_SYNC_COMMAND("DESC-SYNC-COMMAND", "Sync MySQL database with server (Use only once per server)."),
    /**
     * Sync Autorank's time to Stats' time.
     */
    DESC_SYNC_STATS_COMMAND("DESC-SYNC-STATS-COMMAND", "Sync Autorank's time to Stats' time."),
    /**
     * Show the amount of time you played.
     */
    DESC_TIMES_COMMAND("DESC-TIMES-COMMAND", "Show the amount of time you played."),
    /**
     * Track the progress of a requirement.
     */
    DESC_TRACK_COMMAND("DESC-TRACK-COMMAND", "Track the progress of a requirement."),
    /**
     * Gives a preview of a certain ranking path
     */
    DESC_VIEW_COMMAND("DESC-VIEW-COMMAND", "Gives a preview of a certain ranking path."),

    

    /**
     * /ar add [player] [value]
     */
    USAGE_ADD_COMMAND("USAGE-ADD-COMMAND", "/ar add [player] [value]"),
    /**
     * /ar backup <file>
     */
    USAGE_BACKUP_COMMAND("DESC-BACKUP-COMMAND", "/ar backup <file>"),
    /**
     * /ar check <player> <path>
     */
    USAGE_CHECK_COMMAND("USAGE-CHECK-COMMAND", "/ar check <player> <path>"),
    /**
     * /ar choose <path>
     */
    USAGE_CHOOSE_COMMAND("USAGE-CHECK-COMMAND", "/ar check <player> <path>"),
    /**
     * /ar complete <req id> <path>
     */
    USAGE_COMPLETE_COMMAND("USAGE-CHOOSE-COMMAND", "/ar complete <req id> <path>"),
    /**
     * /ar deactivate <path>
     */
    USAGE_DEACTIVATE_COMMAND("USAGE-DEACTIVATE-COMMAND", "/ar deactivate <path>"),
    /**
     * /ar debug
     */
    USAGE_DEBUG_COMMAND("USAGE-DEBUG-COMMAND", "/ar debug"),
    /**
     * /ar editor
     */
    USAGE_EDITOR_COMMAND("USAGE-EDITOR-COMMAND", "/ar editor"),
    /**
     * /ar forcecheck <player>
     */
    USAGE_FORCECHECK_COMMAND("USAGE-FORCECHECK-COMMAND", "/ar forcecheck <player>"),
    /**
     * /ar gadd [player] [value]
     */
    USAGE_GLOBALADD_COMMAND("USAGE-GLOBALADD-COMMAND", "/ar gadd [player] [value]"),
    /**
     * /ar gcheck [player]
     */
    USAGE_GLOBALCHECK_COMMAND("USAGE-GLOBALCHECK-COMMAND", "/ar gcheck [player]"),
    /**
     * /ar gset [player] [value]
     */
    USAGE_GLOBALSET_COMMAND("USAGE-GLOBALSET-COMMAND", "/ar gset [player] [value]"),
    /**
     * /ar help <page>
     */
    USAGE_HELP_COMMAND("USAGE-HELP-COMMAND", "/ar help <page>"),
    /**
     * /ar hooks
     */
    USAGE_HOOKS_COMMAND("USAGE-HOOKS-COMMAND", "/ar hooks"),
    /**
     * /ar import <parameters>
     */
    USAGE_IMPORT_COMMAND("USAGE-IMPORT-COMMAND", "/ar import <parameters>"),
    /**
     * /ar info <player>
     */
    USAGE_INFO_COMMAND("USAGE-INFO-COMMAND", "/ar info <player>"),
    /**
     * /ar leaderboard <type>
     */
    USAGE_LEADERBOARD_COMMAND("USAGE-LEADERBOARD-COMMAND", "/ar leaderboard <type>"),
    /**
     * /ar migrate <type>
     */
    USAGE_MIGRATE_COMMAND("USAGE-MIGRATE-COMMAND", "/ar migrate <type>"),
    /**
     * /ar reload
     */
    USAGE_RELOAD_COMMAND("USAGE-RELOAD-COMMAND", "/ar reload"),
    /**
     * /ar remove [player] [value]
     */
    USAGE_REMOVE_COMMAND("USAGE-REMOVE-COMMAND", "/ar remove [player] [value]"),
    /**
     * /ar reset <player> <action>
     */
    USAGE_RESET_COMMAND("USAGE-RESET-COMMAND", "/ar reset <player> <action>"),
    /**
     * /ar set [player] [value]
     */
    USAGE_SET_COMMAND("USAGE-SET-COMMAND", "/ar set [player] [value]"),
    /**
     * /ar sync
     */
    USAGE_SYNC_COMMAND("USAGE-SYNC-COMMAND", "/ar sync"),
    /**
     * /ar syncstats
     */
    USAGE_SYNC_STATS_COMMAND("USAGE-SYNC-STATS-COMMAND", "/ar syncstats"),
    /**
     * /ar times <player>
     */
    USAGE_TIMES_COMMAND("USAGE-TIMES-COMMAND", "/ar times <player>"),
    /**
     * /ar track <req id> <path>
     */
    USAGE_TRACK_COMMAND("USAGE-TRACK-COMMAND", "/ar track <req id> <path>"),
    /**
     * /ar view <path name> or /ar view list
     */
    USAGE_VIEW_COMMAND("USAGE-VIEW-COMMAND", "/ar track <req id> <path>"),


    ;




    private static FileConfiguration LANG;

    /**
     * Lang enum constructor.
     *
     * @param path  The string path.
     * @param start The default string.
     */
    Lang(final String path, final String start) {
        this.path = path;
        this.def = start;
    }

    Lang(String string) {
        this.def = string;
    }

    private final String def;
    private String path;

    /**
     * Set the {@code FileConfiguration} to use.
     *
     * @param config The config to set.
     */
    public static void setFile(final FileConfiguration config) {
        LANG = config;
    }

    /**
     * Get the value in the config with certain arguments.
     *
     * @param args arguments that need to be given. (Can be null)
     * @return value in config or otherwise default value
     */
    public String getConfigValue(final Object... args) {
        String value = ChatColor.translateAlternateColorCodes('&', LANG.getString(getPath(), getDefault()));

        if (args == null || args.length == 0)
            return value;
        else {

            if (args[0] == null) return value;

            for (int i = 0; i < args.length; i++) {
                value = value.replace("{" + i + "}", args[i].toString());
            }
        }

        return value;
    }

    /**
     * Get the default value of the path.
     *
     * @return The default value of the path.
     */
    public String getDefault() {
        return this.def;
    }

    /**
     * Get the path to the string.
     *
     * @return The path to the string.
     */
    public String getPath() {
        if (path == null) {
            return this.toString().replace("_", "-");
        }

        return this.path;
    }
}
