package net.makiru.spigot.lang;

import net.makiru.api.config.C;
import net.makiru.commons.tools.Languages;
import org.bukkit.ChatColor;
import org.jetbrains.annotations.NotNull;

import static net.makiru.commons.tools.Languages.FRENCH;

public enum L {

    //TODO/ HUB
    //TODO: WELCOME
    WELCOME {
        @Override
        public String[] get(@NotNull Languages language) {
            if (language.equals(FRENCH))
                return new String[]{
                        "§8§l§m------------§d §lMakiru §8§l§m------------",
                        " ",
                        "§b§lINFO §8» §7Le serveur est en phase §cBêta§7, en cas d'incidents, merci de bien vouloir nous le signaler.",
                        " ",
                        "§e§lSalutations, {name}",
                        " ",
                        "§7§oPour avoir quelques informations à propos du serveur » §l/info",
                        " "
                };
            return new String[]{
                    "§8§l§m---------§d §lMakiru §8§l§m---------",
                    " ",
                    "§b§lINFO §8» §7The server is in §cBeta§7 phase, in case of incidents, please report it to us.",
                    " ",
                    "§e§lGreetings, {name}",
                    " ",
                    "§7§oTo have some information about the server » §l/info",
                    " "
            };
        }
    },


    //TODO:
    //TODO:
    //TODO:
    //TODO: YES
    YES {
        @Override
        public String get(@NotNull final Languages language) {
            if (language.equals(FRENCH))
                return "Oui";
            return "Yes";
        }
    },

    //TODO: NO
    NO {
        @Override
        public String get(@NotNull final Languages language) {
            if (language.equals(FRENCH))
                return "Non";
            return "No";
        }
    },

    //TODO: SHOW_PLAYER
    SHOW_PLAYER {
        @Override
        public String get(@NotNull final Languages language) {
            if (language.equals(FRENCH))
                return ChatColor.GREEN + "Afficher les joueurs.";
            return ChatColor.GREEN + "Show players.";
        }
    },

    //TODO: HIDE_PLAYER
    HIDE_PLAYER {
        @Override
        public String get(@NotNull final Languages language) {
            if (language.equals(FRENCH))
                return ChatColor.RED + "Cacher les joueurs.";
            return ChatColor.RED + "Hide players.";
        }
    },

    //TODO: NOT_PERFORM_OPERATION
    NOT_PERFORM_OPERATION {
        @Override
        public String get(
                @NotNull final Languages language) {
            if (language.equals(FRENCH))
                return ChatColor.GRAY + "Il nous est impossible d'effectuer l'opération, veuillez contacter le support si le problème persiste.\n";
            return ChatColor.GRAY + "We can not perform the operation, please contact support if the problem persists.\n";
        }
    },

    //TODO: PRIVILEGES_NOT_ENOUGHT
    PRIVILEGES_NOT_ENOUGHT {
        @Override
        public String get(@NotNull final Languages language) {
            if (language.equals(FRENCH))
                return ChatColor.RED + "Vos privilèges ne vous permettent pas d'effectuer cette action.\n";
            return ChatColor.RED + "Your privileges don't allow you to perform this action.\n";
        }
    },

    //TODO: PRIVILEGES_INFERIOR
    PRIVILEGES_INFERIOR {
        @Override
        public String get(@NotNull final Languages language) {
            if (language.equals(FRENCH))
                return ChatColor.RED + "Vos privilèges sont inférieurs à la personne à laquelle vous souhaitez effectuer cette action et donc cela ne vous permet pas d'effectuer cette action.\n";
            return ChatColor.RED + "Your privileges are lower than the person to whom you wish to perform this action and therefore this does not allow you to perform this action.\n";
        }
    },

    //TODO:
    //TODO:
    //TODO:
    //TODO: HUB
    //TODO: TOOLBAR
    //TODO: NAVIGATOR_TOOLBAR
    NAVIGATOR_TOOLBAR {
        @Override
        public String get(@NotNull final Languages language) {
            if (language.equals(FRENCH))
                return "§7» §e§lNavigateur §8(Click-Droit)";
            return "§7» §e§lNavigator §8(Click-Droit)";
        }
    },

    //TODO: NAVIGATOR_LORES_TOOLBAR
    NAVIGATOR_LORES_TOOLBAR {
        @Override
        public String[] get(@NotNull final Languages language) {
            if (language.equals(FRENCH))
                return new String[]{
                        " ",
                        "§cNavigue§7,",
                        "§bprends plaisir",
                        "§7et §aamuses-toi §7sur le serveur en t'aidant de cette boussole.",
                        " ",
                        "§8Accéder au Navigateur."
                };
            return new String[]{
                    " ",
                    "§cBrowse§7",
                    "§7and §ahave fun §7on the server using this compass.",
                    " ",
                    "§8Access the Navigator."
            };
        }
    },

    //TODO: ODDS_AND_ENDS_TOOLBAR
    ODDS_AND_ENDS_TOOLBAR {
        @Override
        public String get(@NotNull final Languages language) {
            if (language.equals(FRENCH))
                return "§7» §f§lBric-À-Brac §8(Click-Droit)";
            return "§7» §f§lOdds-And-Ends §8(Right-Click)";
        }
    },

    //TODO: ODDS_AND_ENDS_LORES_TOOLBAR
    ODDS_AND_ENDS_LORES_TOOLBAR {
        @Override
        public String[] get(@NotNull final Languages language) {
            if (language.equals(FRENCH))
                return new String[]{
                        " ",
                        "§7Trouver votre §bplaisir §7dans le §fbric-à-brac§7,",
                        "§7vos §eboosters§7,",
                        "§7vos §aaméliorations dans les jeux§7,",
                        "§7vos §canimaux de compagnie",
                        "§7et §dpleins d'autres choses encore§7...",
                        " ",
                        "§8Accéder au Bric-À-Brac."
                };
            return new String[]{
                    " ",
                    "§7Find your §bpleasure §7in §fodds and ends§7,",
                    "§7your §eboosters§7,",
                    "§7§ayour improvements in games§7,",
                    "§7your §cpets",
                    "§7and §7§dmany other things67...",
                    " ",
                    "§8Access the Odds-And-Ends."
            };
        }
    },

    //TODO: PROFIL_TOOLBAR
    PROFIL_TOOLBAR {
        @Override
        public String get(@NotNull final Languages language) {
            if (language.equals(FRENCH))
                return "§7» §a§lProfil §8(Click-Droit)";
            return  "§7» §a§lProfile §8(Right-Click)";
        }
    },

    //TODO: PROFIL_LORES_TOOLBAR
    PROFIL_LORES_TOOLBAR {
        @Override
        public String[] get(@NotNull final Languages language) {
            if (language.equals(FRENCH))
                return new String[]{
                        " ",
                        "§7Regarder les §cstatistiques §7de votre profil,",
                        "§7et §equelque information §7sur ce dernier.",
                        " ",
                        "§8Accéder au Profil."
                };
            return new String[]{
                    " ",
                    "§7Look at your profile §cstatistics§7,",
                    "§7and §esome information §7about it.",
                    " ",
                    "§8Access the Odds-And-Ends Profile."
            };
        }
    },

    //TODO: SHOP_TOOLBAR
    SHOP_TOOLBAR {
        @Override
        public String get(@NotNull final Languages language) {
            if (language.equals(FRENCH))
                return "§7» §b§lBoutique §8(Click-Droit)";
            return "§7» §b§lShop §8(Right-Click)";
        }
    },

    //TODO: SHOP_LORES_TOOLBAR
    SHOP_LORES_TOOLBAR {
        @Override
        public String[] get(@NotNull final Languages language) {
            if (language.equals(FRENCH))
                return new String[]{
                        " ",
                        "§7Faites vos §cachats §7dans la boutique,",
                        "§bgrâce à la monnaie que vous récupérez en jouant sur le serveur§7,",
                        "§7et §aau point en gagnant des parties§7...",
                        " ",
                        "§8Accéder à la Boutique."
                };
            return new String[]{
                    " ",
                    "§7Make your §cpurchases §7in the shop,",
                    "§bthanks to the currency you get by playing on the server§7,",
                    "§7and to §athe point by winning games§7...",
                    " ",
                    "§8Access the Shop."
            };
        }
    },

    //TODO: SETTINGS_TOOLBAR
    SETTINGS_TOOLBAR {
        @Override
        public String get(@NotNull final Languages language) {
            if (language.equals(FRENCH))
                return "§7» §c§lPréférences §8(Click-Droit)";
            return "§7» §c§lSettings §8(Right-Click)";
        }
    },

    //TODO: SETTINGS_LORES_TOOLBAR
    SETTINGS_LORES_TOOLBAR {
        @Override
        public String[] get(@NotNull final Languages language) {
            if (language.equals(FRENCH))
                return new String[]{
                        " ",
                        "§7Configurer le §ccomportement",
                        "§7et §7le gameplay pour votre bien-être en jeu.",
                        " ",
                        "§8Accéder aux Préférences."
                };
            return new String[]{
                    " ",
                    "§cConfigure behavior",
                    "§7and §7gameplay for your in-game well-being.",
                    " ",
                    "§8Access the Settings."
            };
        }
    },

    /*N_ {
        @Override
        public String[] get(@NotNull final Languages language) {
            if (language.equals(FRENCH))
                return new String[] {};
            return new String[] {};
        }
    },

    N_ {
        @Override
        public String[] get(@NotNull final Languages language) {
            if (language.equals(FRENCH))
                return new String[] {};
            return new String[] {};
        }
    },*/

    //TODO:
    //TODO:
    //TODO:
    //TODO: EXCEPTION
    //TODO: REDIS_EXCEPTION
    REDIS_EXCEPTION {
        @Override
        public String get(@NotNull Languages language) {
            if (language.equals(FRENCH))
                return ChatColor.GRAY + "Nos serveurs redis sont actuellement indisponibles, ou rencontrent certains problèmes. (" + C.WEB_STATUS.get() + ")\n";
            else
                return ChatColor.GRAY + "Our Redis servers are currently down, unavailable, or are experiencing some problems. (" + C.WEB_STATUS.get() + ")\n";
        }
    },

    //TODO: ACCOUNT_NOT_FOUND_EXCEPTION
    ACCOUNT_NOT_FOUND_EXCEPTION {
        @Override
        public String get(@NotNull final Languages language) {
            if (language.equals(FRENCH))
                return ChatColor.GRAY + "Une erreur est survenue lors de la récupération du compte depuis '{name}'.\n";
            return ChatColor.GRAY + "An error occurred while recovering the account from '{name}'.\n";
        }
    },

    //TODO: REPORT_NOT_FOUND_EXCEPTION
    REPORT_NOT_FOUND_EXCEPTION {
        @Override
        public String get(@NotNull final Languages language) {
            if (language.equals(FRENCH))
                return ChatColor.GRAY + "Une erreur est survenue lors de la récupération du rapport depuis '#{id}.\n";
            return ChatColor.GRAY + "An error occurred while recovering the report from '#c{id}'.\n";
        }
    },

    //TODO: UUIDFETCH_EXCEPTION
    UUIDFETCH_EXCEPTION {
        @Override
        public String get(@NotNull final Languages language) {
            if (language.equals(FRENCH))
                return ChatColor.GRAY + "Une erreur est survenue lors de la récupération de l'UUID depuis '{name}'.\n";
            return ChatColor.GRAY + "An error occurred while recovering the UUID from '{name}'.\n";
        }
    },

    //TODO: NAMEFETCH_EXCEPTION
    NAMEFETCH_EXCEPTION {
        @Override
        public String get(@NotNull final Languages language) {
            if (language.equals(FRENCH))
                return ChatColor.GRAY + "Une erreur est survenue lors de la récupération du nom depuis '{uuid}'.\n";
            return ChatColor.GRAY + "An error occurred while recovering the name from '{uuid}'.\n";
        }
    },

    //TODO: INTEGER_PARSER_EXCEPTION
    INTEGER_PARSER_EXCEPTION {
        @Override
        public String get(@NotNull final Languages language) {
            if (language.equals(FRENCH))
                return ChatColor.GRAY + "Veuillez utiliser un nombre entier. (Ex: '5')\n";
            return ChatColor.GRAY + "Please use an integer. (E.g: '5')\n";
        }
    },

    //TODO: DECIMAL_PARSER_EXCEPTION
    DECIMAL_PARSER_EXCEPTION {
        @Override
        public String get(@NotNull final Languages language) {
            if (language.equals(FRENCH))
                return ChatColor.GRAY + "Veuillez *pouvais* utiliser un nombre décimal. (Ex: '5.5')\n";
            return ChatColor.GRAY + "Please *could* use a decimal number. (E.g: '5.5')\n";
        }
    };


    public abstract Object get(@NotNull final Languages language);

}
