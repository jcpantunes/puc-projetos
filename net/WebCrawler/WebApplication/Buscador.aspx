<%@ Page Title="Contact" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="Buscador.aspx.cs" Inherits="WebApplication.Buscador" %>

<asp:Content runat="server" ID="BodyContent" ContentPlaceHolderID="MainContent">
    <hgroup class="title">
        <h1>Buscador</h1>
    </hgroup>

    <section class="contact">
        <header>
            <h3>&nbsp;Palavra chave<br />
&nbsp;
                <asp:TextBox ID="txtPesquisar" runat="server" Width="571px"></asp:TextBox>
&nbsp;&nbsp;
                <asp:Button ID="btnPesquisar" runat="server" Font-Size="Small" Height="32px" OnClick="Button1_Click" Text="Pesquisar" />
            </h3>
            <p>
                <asp:GridView ID="gridIndice" runat="server" CellPadding="4" ForeColor="#333333" GridLines="None" Width="796px">
                    <AlternatingRowStyle BackColor="White" />
                    <EditRowStyle BackColor="#2461BF" />
                    <FooterStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
                    <HeaderStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
                    <PagerStyle BackColor="#2461BF" ForeColor="White" HorizontalAlign="Center" />
                    <RowStyle BackColor="#EFF3FB" />
                    <SelectedRowStyle BackColor="#D1DDF1" Font-Bold="True" ForeColor="#333333" />
                    <SortedAscendingCellStyle BackColor="#F5F7FB" />
                    <SortedAscendingHeaderStyle BackColor="#6D95E1" />
                    <SortedDescendingCellStyle BackColor="#E9EBEF" />
                    <SortedDescendingHeaderStyle BackColor="#4870BE" />
                </asp:GridView>
            </p>
            <p>&nbsp;</p>
        </header>
    </section>
</asp:Content>