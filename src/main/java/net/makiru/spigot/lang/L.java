package net.makiru.spigot.lang;

import net.makiru.api.config.C;
import net.makiru.commons.tools.Languages;
import org.bukkit.ChatColor;
import org.jetbrains.annotations.NotNull;

import static net.makiru.commons.tools.Languages.FRENCH;

public enum L {

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


    public abstract Object get(@NotNull final Languages language);

    public enum Hub {

        //TODO:
        //TODO:
        //TODO:
        //TODO: HUB
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
        //TODO: HUB
        //TODO: TOOLBAR
        //TODO: NAVIGATOR
        NAVIGATOR {
            @Override
            public String get(@NotNull final Languages language) {
                if (language.equals(FRENCH))
                    return "§7» §e§lNavigateur";
                return "§7» §e§lNavigator";
            }
        },

        //TODO: NAVIGATOR_LORES
        NAVIGATOR_LORES {
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

        //TODO: ODDS_AND_ENDS
        ODDS_AND_ENDS {
            @Override
            public String get(@NotNull final Languages language) {
                if (language.equals(FRENCH))
                    return "§7» §f§lBric-À-Brac";
                return "§7» §f§lOdds-And-Ends";
            }
        },

        //TODO: ODDS_AND_ENDS_LORES
        ODDS_AND_ENDS_LORES {
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

        //TODO: PROFIL
        PROFIL {
            @Override
            public String get(@NotNull final Languages language) {
                if (language.equals(FRENCH))
                    return "§7» §a§lProfil";
                return "§7» §a§lProfile";
            }
        },

        //TODO: PROFIL_LORES
        PROFIL_LORES {
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

        //TODO: SHOP
        SHOP {
            @Override
            public String get(@NotNull final Languages language) {
                if (language.equals(FRENCH))
                    return "§7» §b§lBoutique";
                return "§7» §b§lShop";
            }
        },

        //TODO: SHOP_LORES
        SHOP_LORES {
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

        //TODO: SETTINGS
        SETTINGS {
            @Override
            public String get(@NotNull final Languages language) {
                if (language.equals(FRENCH))
                    return "§7» §c§lPréférences";
                return "§7» §c§lSettings";
            }
        },

        //TODO: SETTINGS_LORES
        SETTINGS_LORES {
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

        //TODO: CLUEDO_LORES
        CLUEDO_LORES {
            @Override
            public String[] get(@NotNull Languages language) {
                if (language.equals(FRENCH))
                    return new String[]{
                            "§aI§bn§cé§dd§ei§ft",
                            " ",
                            "§7§oSous les traits d'Harry. Ron. Hermione. Ginny. Luna ou Neville.",
                            "Vous devez découvrir qui est responsable de sa disparition.",
                            "Quel objet a été utilisé et où cet étudiant a été enlevé.",
                            " ",
                            "§eGenre §8» §fMystère, Stratégie",
                            "§bDurée §8» §f30 minutes",
                            "§dNombre de joueurs §8» §f2 à 6 joueurs",
                            " ",
                            "§cJouer dés maintenant."
                    };
                return new String[]{
                        "§aN§bo§cv§de§el",
                        " ",
                        "§7§oIn the guise of Harry. Ron. Hermione. Ginny. Luna or Neville.",
                        "You must find out who is responsible for his disappearance.",
                        "What object was used and where this student was removed.",
                        " ",
                        "§eType §8» §fMystery, Strategy",
                        "§bDuration §8» §f30 minutes",
                        "§dNumbers of players §8» §f2 to 6 players",
                        " ",
                        "§cPlay now."
                };
            }
        },

        //TODO: WEREWOLF_LORES
        WEREWOLF_LORES {
            @Override
            public String[] get(@NotNull Languages language) {
                if (language.equals(FRENCH))
                    return new String[]{
                            "§aI§bn§cé§dd§ei§ft",
                            " ",
                            "§7§oQui, autour de cette table, est le loup-garou ?",
                            "Comment, vous ne connaissez pas Thiercelieux ?",
                            "Un si joli petit village de l'est,",
                            "Bien à l'abri des vents et du froid,",
                            "Niché entre de charmantes forêts et de bons paturages.",
                            "Les habitants de Thiercelieux sont d'affables paysans,",
                            "Heureux de leur tranquillité et fiers de leur travail.",
                            " ",
                            "§eGenre §8» §fStratégie, Jeu de rôle",
                            "§bDurée §8» §f30 minutes",
                            "§dNombre de joueurs §8» §f2 à 12 joueurs",
                            " ",
                            "§cJouer dés maintenant."
                    };
                return new String[]{
                        "§aN§bo§cv§de§el",
                        " ",
                        "§7§oWho around this table is the werewolf?",
                        "How, you do not know Thiercelieux?",
                        "Such a pretty little village in the east,",
                        "Well sheltered from the wind and the cold,",
                        "Nestled between charming forests and good pastures.",
                        "The inhabitants of Thiercelieux are affable peasants,",
                        "Happy with their tranquility and proud of their work.",
                        " ",
                        "§eType §8» §fStrategy, Role playing",
                        "§bDuration §8» §f30 minutes",
                        "§dNumbers of players §8» §f2 to 12 players",
                        " ",
                        "§cPlay now."
                };
            }
        },

        //TODO: DEATHNOTE_WEREWOLF_LORES
        DEATHNOTE_WEREWOLF_LORES {
            @Override
            public String[] get(@NotNull Languages language) {
                if (language.equals(FRENCH))
                    return new String[]{
                            "§aI§bn§cé§dd§ei§ft",
                            " ",
                            "§7§oQui, autour de cette table, est Kira ?",
                            "Comment, vous ne connaissez pas Tokyo ?",
                            "Une grande ville densément peuplé, [...].",
                            // "Bien à l'abri des vents et du froid,",
                            // "Niché entre de charmantes forêts et de bons paturages.",
                            // "Les habitants de Thiercelieux sont d'affables paysans,",
                            // "Heureux de leur tranquillité et fiers de leur travail.",
                            " ",
                            "§eGenre §8» §fStratégie, Jeu de rôle",
                            "§bDurée §8» §f30 minutes",
                            "§dNombre de joueurs §8» §f2 à 12 joueurs",
                            " ",
                            "§cJouer dés maintenant."
                    };
                return new String[]{
                        "§aN§bo§cv§de§el",
                        " ",
                        "§7§oWho around this table is the Kira?",
                        "How, you do not know Tokyo?",
                        "A large, densely populated city, [...].",
                        //"Well sheltered from the wind and the cold,",
                        //"Nestled between charming forests and good pastures.",
                        //"The inhabitants of Thiercelieux are affable peasants,",
                        //"Happy with their tranquility and proud of their work.",
                        " ",
                        "§eType §8» §fStrategy, Role playing",
                        "§bDuration §8» §f30 minutes",
                        "§dNumbers of players §8» §f2 to 12 players",
                        " ",
                        "§cPlay now."
                };
            }
        },

        //TODO: MONOPOLY_LORES
        MONOPOLY_LORES {
            @Override
            public String[] get(@NotNull Languages language) {
                if (language.equals(FRENCH))
                    return new String[]{
                            "§aI§bn§cé§dd§ei§ft",
                            " ",
                            "§7§oMonopoly édition France,",
                            "Achetez les plus beaux sites de France!",
                            "Achetez, vendez et négociez les plus beaux sites de France,",
                            "Mais comme toujours au Monopoly attention à la faillite !",
                            "A vous de bien choisir et de bien négocier avec vos adversaires.",
                            " ",
                            "§eGenre §8» §fArgent",
                            "§bDurée §8» §f~90 minutes",
                            "§dNombre de joueurs §8» §f6 joueurs",
                            " ",
                            "§cJouer dés maintenant."
                    };
                return new String[]{
                        "§aN§bo§cv§de§el",
                        " ",
                        "§7§oMonopoly France edition,",
                        "Buy the most beautiful sites in France!",
                        "Buy, sell and negotiate the most beautiful sites in France,",
                        "but as always at Monopoly beware of bankruptcy!",
                        "It's up to you to choose well and negotiate well with your opponents.",
                        " ",
                        "§eType §8» §fMoney",
                        "§bDuration §8» §f~90 minutes",
                        "§dNumbers of players §8» §f6 players",
                        " ",
                        "§cPlay now."
                };
            }
        },

        //TODO: MURDER_LORES
        MURDER_LORES {
            @Override
            public String[] get(@NotNull Languages language) {
                if (language.equals(FRENCH))
                    return new String[]{
                            "§aI§bn§cé§dd§ei§ft",
                            " ",
                            "§7§oUn assassin rôde dans les parages, poignard en main,",
                            "Et ne cherche qu'une chose: à assassiner les autres joueurs.",
                            "Ces derniers ont donc tout intérêt à démasquer le meurtrier",
                            "Avant qu'il ne vienne les tuer.",
                            "Malheureusement, ils n'ont qu'un moyen d'en venir à bout.",
                            " ",
                            "§eGenre §8» §fTtrahison, Suspicions, Ruses",
                            "§bDurée §8» §f30 minutes",
                            "§dNombre de joueurs §8» §f3 à 32 joueurs",
                            " ",
                            "§cJouer dés maintenant."
                    };
                return new String[]{
                        "§aN§bo§cv§de§el",
                        " ",
                        "§7§oAn assassin prowls around, dagger in hand,",
                        "And seeks only one thing: to assassinate the other players.",
                        "The latter therefore have every interest in unmasking the murderer",
                        "Before he comes to kill them.",
                        "Unfortunately, they have only one way to get around it.",
                        " ",
                        "§eType §8» §fBetrayal, Suspicion, Tricks",
                        "§bDuration §8» §f30 minutes",
                        "§dNumbers of players §8» §f3 to 32 players",
                        " ",
                        "§cPlay now."
                };
            }
        },

        //TODO: FASTGAME_REISSUE_LORES
        FASTGAME_REISSUE_LORES {
            @Override
            public String[] get(@NotNull Languages language) {
                if (language.equals(FRENCH))
                    return new String[]{
                            "§dRéédition",
                            " ",
                            "§7§oAttention sous-vos pieds.",
                            " ",
                            "§eGenre §8» §fFastGame",
                            "§bDurée §8» §f5 à 10 minutes",
                            "§dNombre de joueurs §8» §f2 à 12 joueurs",
                            " ",
                            "§cJouer dés maintenant."
                    };
                return new String[]{
                        "§dReissue",
                        " ",
                        "§7§oWatch out under your feet.",
                        " ",
                        "§eType §8» §fFastGame",
                        "§bDuration §8» §f5 to 10 minutes",
                        "§dNumbers of players §8» §f2 to 12 players",
                        " ",
                        "§cPlay now."
                };
            }
        },


        //TODO: CLOSE
        CLOSE {
            @Override
            public String get(@NotNull Languages language) {
                if (language.equals(FRENCH))
                    return "§7» §c§lFermer";
                return "§7» §c§lClose";
            }
        },

        //TODO: BLACK
        BLACK {
            @Override
            public String get(@NotNull Languages language) {
                if (language.equals(FRENCH))
                    return "§7» §c§lRetour";
                return "§7» §c§lBack";
            }
        };

        public abstract Object get(@NotNull final Languages language);
    }

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

}
