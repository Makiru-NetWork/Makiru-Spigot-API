package net.makiru.spigot.lang;

import net.makiru.api.config.C;
import net.makiru.commons.tools.Languages;
import org.bukkit.ChatColor;
import org.jetbrains.annotations.NotNull;

import static net.makiru.commons.tools.Languages.FRENCH;

public enum L {

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


    public abstract String get(@NotNull final Languages language);

}
