<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="ISOMessage/data">

        <ISOMessage>
            <data>
                <xsl:apply-templates/>
            </data>
        </ISOMessage>

    </xsl:template>

    <xsl:template match="field">
        <field>
            <xsl:for-each select="*">
                <xsl:choose>
                    <xsl:when test="name()='id'">
                        <xsl:attribute name="{name()}">
                            <xsl:value-of select="text()"/>
                        </xsl:attribute>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:value-of select="."/>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:for-each>
        </field>
    </xsl:template>
</xsl:stylesheet>