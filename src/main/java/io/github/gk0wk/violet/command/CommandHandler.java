package io.github.gk0wk.violet.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

@Deprecated
public interface CommandHandler {
    /**
     * 执行某个命令
     * @param sender  发送指令者的实例
     * @param command 被执行的指令实例
     * @param token   指令的标识字符串
     * @param args    指令的参数
     */
    void executeCommand(@NotNull CommandSender sender, @NotNull Command command,
                        @NotNull String token, @NotNull String[] args) throws Exception;
}
