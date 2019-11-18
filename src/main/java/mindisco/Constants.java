package mindisco;

import io.anuke.arc.Core;
import io.anuke.arc.files.FileHandle;
import io.anuke.arc.util.serialization.Json;

public class Constants {
    public static final String mindiscoRoot = "mods/mindisco/";
    public static final String mindiscoBotToken = Core.settings.getDataDirectory().child(Constants.mindiscoRoot + "token.txt").readString();
    public static final String defaultBannedByName = "anonymous";
    public static final String discordBanMessage = "Whoopsie! Looks like you've been banned for %s. If you suspect this is a mistake, please contact the moderators.";
    public static final String verificationAlreadyVerified = "This code is invalid!";
    public static final String verificationInvalidCode = "This code is invalid!";
    public static final String verificationExpiredCode = "This code has expired!";
    public static final String verificationSuccessMessage = "Successfully verified! Re-join to play.";
    public static final String verificationCommandDescription = "Command to verify yourself.";

    public static final Json jsonInstance = new Json();
    public static final FileHandle mindiscoBanFile = Core.settings.getDataDirectory().child(Constants.mindiscoRoot + "bans.json");
    public static final String verificationCommandName = "verify";
    public static final String verificationCommandArgs = "<code>";
}