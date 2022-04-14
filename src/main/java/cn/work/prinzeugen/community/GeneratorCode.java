package cn.work.prinzeugen.community;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;

/**
 * @author prinzeugen
 */
public class GeneratorCode {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/super_mall", "root", "1145141919810")
                .globalConfig(builder -> {
                    builder.outputDir("/Users/prinzeugen/IdeaProjects/MyCommunity/src/main/java")
                            .enableSwagger()
                            .author("PrinzEugen");
                })
                .packageConfig(builder -> {
                    builder.parent("cn.work.prinzeugen")
                            .moduleName("community");
                })
                .strategyConfig(builder -> {
                    builder.controllerBuilder().enableRestStyle().enableHyphenStyle();
                }).execute();
    }
}
